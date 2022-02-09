package com.mds.dtos;

import java.util.List;

import org.springframework.stereotype.Component;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Component
@Getter(value = AccessLevel.PUBLIC)
@Setter(value = AccessLevel.PUBLIC)
@ToString(exclude = {"prescriptionId"})
public class PrescriptionDTO {

	private int days;
	
	private int dispensedQuantity;
	
	private String drugName;
	
	private PatientDTO patient;
	
	private int prescribedQuantity;
	
	private int prescriptionId;
	
	private List<PrescriptionFillDTO> presFill;
	 
	private int refillQuantity;

	private int refills;

}
