package com.mds.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//JPA Annotation
@Entity
//JPA Annotation
@Table(name="patient")
@Getter(value = AccessLevel.PUBLIC)
@Setter(value = AccessLevel.PUBLIC)
@ToString(exclude = {"patientId"})
public class Patient {
	//JPA Annotation
	@Id
	/*
	 * Strategy - GenerationType.AUTO 
	 *    -GenerationType.IDENTITY 
	 *    -GenerationType.TABLE 
	 *    -@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "seq_name_for_using_in_GenerationType.SEQUENCE_annotation")
	 *     JPA Annotation
	        @SequenceGenerator(name = "seq_name_for_using_in_GenerationType.SEQUENCE_annotation", sequenceName = "sequence_name_in_oracle_db")
	        -@GeneratedValue(strategy=GenerationType.TABLE, generator ="seq_name_for_using_in_GenerationType.TABLE_annotation")
	        JPA Annotation
	        @TableGenerator(name = "seq_name_for_using_in_GenerationType.TABLE_annotation", 
	         schema ="schema_in_which_keyTable_exist", table = "keyTable_name", pkColumnName = "pkcoulmnName_of_keyTable",
	          valueColumnName = "valueColumnName_of_keyTable")	
	 */
	//JPA Annotation
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "patient_id")
	private int patientId;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "middle_name")
	private String middleName;
	
	private String gender;

	//JPA Annotation
	@Column(name="dob", nullable=false)
	//JPA Annotation
	@Temporal(TemporalType.TIMESTAMP)
	private Date birthDate;
	
	private String mail;
	
	//JPA Annotation
	@Transient
	private boolean valid;

	//JPA Annotation
	@Embedded
	@AttributeOverrides({@AttributeOverride(name = "home_contact", column = @Column(name = "home_contact")),
			@AttributeOverride(name = "mobile_contact", column = @Column(name="mobile_contact")),
			@AttributeOverride(name = "office_contact", column = @Column(name="office_contact"))})
	private Contact contact;
	
	//All JPA Annotation
	@ElementCollection
	@CollectionTable(name = "patient_address", joinColumns = @JoinColumn(name="patient_id"))
	@AttributeOverrides({@AttributeOverride(name = "street", column = @Column(name = "street")), @AttributeOverride(name = "city", column = @Column(name="city")),
		@AttributeOverride(name = "state", column = @Column(name="state"))})
	private List<PatientAddress> address;

	//If I use "mappedBy" attribute in owning entity then we can suppress one additional update query which is triggered if
	//I use "mappedBy" attribute in non-owning entity in a Bi-Directional relationship.
	@OneToMany(cascade = CascadeType.REMOVE, mappedBy = "patient")
	private List<Prescription> pres;
}
