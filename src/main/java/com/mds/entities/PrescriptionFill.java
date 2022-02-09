package com.mds.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="prescription_fill")
@Getter(value = AccessLevel.PUBLIC)
@Setter(value = AccessLevel.PUBLIC)
@ToString(exclude = {"prescriptionFillId"})
public class PrescriptionFill {

	private int days;
	
	@Column(name = "dispensed_quantity")
	private int dispensedQuantity;
	
	@Column(name = "fill_number")
	private int fillNumber;
	
	//JPA Annotation
	@Temporal(TemporalType.DATE)
	@Column(name = "pickup_date")
	private Date pickupDate;
	
	@ManyToOne
	@JoinColumn(name = "prescription_id", nullable = false)
	private Prescription pres;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "prescription_fill_id")
	private int prescriptionFillId;
	
}
