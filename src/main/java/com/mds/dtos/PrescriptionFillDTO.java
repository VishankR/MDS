package com.mds.dtos;

import java.util.Date;

import org.springframework.stereotype.Component;

import com.mds.entities.Prescription;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Component
@Getter(value = AccessLevel.PUBLIC)
@Setter(value = AccessLevel.PUBLIC)
@ToString(exclude = {"prescriptionFillId"})
public class PrescriptionFillDTO {

	private int days;
	
	private int dispensedQuantity;
	
	private int fillNumber;

	private Date pickupDate;
	
	private Prescription pres;

	private int prescriptionFillId;

}
