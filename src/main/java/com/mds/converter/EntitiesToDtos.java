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
public class EntitiesToDtos {
	
	ModelMapper modelMapper = new ModelMapper();;
	
	public ContactDTO getContactDTOFromEntity(Contact contact) {
		return modelMapper.map(contact, ContactDTO.class);
	}
	public PatientAddressDTO getPatientAddressDTOFromEntity(PatientAddress patAdd) {
		return modelMapper.map(patAdd, PatientAddressDTO.class);
	}
	public PatientDTO getPatientDTOFromEntity(Patient patient) {
		return modelMapper.map(patient, PatientDTO.class);
	}
	public PrescriptionDTO getPrescriptionDTOFromEntity(Prescription pres) {
		return modelMapper.map(pres, PrescriptionDTO.class);
	}
	public PrescriptionFillDTO getPrescriptionFillDTOFromEntity(PrescriptionFill presFill) {
		return modelMapper.map(presFill, PrescriptionFillDTO.class);
	}
}
