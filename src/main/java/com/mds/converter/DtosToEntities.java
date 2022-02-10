package com.mds.converter;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.mds.dtos.ContactDTO;
import com.mds.dtos.PatientAddressDTO;
import com.mds.dtos.PatientDTO;
import com.mds.dtos.PrescriptionDTO;
import com.mds.dtos.PrescriptionFillDTO;
import com.mds.entities.Contact;
import com.mds.entities.Patient;
import com.mds.entities.PatientAddress;
import com.mds.entities.Prescription;
import com.mds.entities.PrescriptionFill;

@Component
public class DtosToEntities {
	
	ModelMapper modelMapper = new ModelMapper();
	
	public Contact getContactEntityFromDTO(ContactDTO contactDTO) {
		return modelMapper.map(contactDTO, Contact.class);
	}
	public PatientAddress getPatientAddressEntityFromDTO(PatientAddressDTO patAddDTO) {
		return modelMapper.map(patAddDTO, PatientAddress.class);
	}
	public Patient getPatientDTOFromEntity(PatientDTO patientDTO) {
		return modelMapper.map(patientDTO, Patient.class);
	}
	public Prescription getPrescriptionEntityFromDTO(PrescriptionDTO presDTO) {
		return modelMapper.map(presDTO, Prescription.class);
	}
	public PrescriptionFill getPrescriptionFillEntityFromDTO(PrescriptionFillDTO presFillDTO) {
		return modelMapper.map(presFillDTO, PrescriptionFill.class);
	}
}
