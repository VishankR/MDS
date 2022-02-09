package com.mds.dtos;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Component
@Getter(value = AccessLevel.PUBLIC)
@Setter(value = AccessLevel.PUBLIC)
@ToString(exclude = {"patientId"})
public class PatientDTO {
	
	private int patientId;

	private String firstName;
	
	private String lastName;
	
	private String middleName;
	
	private String gender;

	private Date birthDate;
	
	private String mail;
	
	private ContactDTO contact;
	
	private List<PatientAddressDTO> address;

	private List<PrescriptionDTO> pres;

}
