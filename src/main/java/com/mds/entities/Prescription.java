package com.mds.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="prescription")
@Getter(value = AccessLevel.PUBLIC)
@Setter(value = AccessLevel.PUBLIC)
@ToString(exclude = {"prescriptionId"})
public class Prescription {

	private int days;
	
	@Column(name = "dispensed_quantity")
	private int dispensedQuantity;
	
	@Column(name = "drug_name")
	private String drugName;
	
	@ManyToOne
	@JoinColumn(name = "patient_id", nullable = false)
	private Patient patient;
	
	@Column(name = "prescribed_quantity")
	private int prescribedQuantity;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "prescription_id")
	private int prescriptionId;
	
	@OneToMany(cascade = CascadeType.REMOVE, mappedBy = "pres")
	private List<PrescriptionFill> presFillList;
	
	@Column(name = "refill_quantity")
	private int refillQuantity;

	private int refills;
	
}
