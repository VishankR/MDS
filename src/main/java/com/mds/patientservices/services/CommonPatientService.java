package com.mds.patientservices.services;

import com.mds.patientservices.entities.Patient;
import com.mds.patientservices.repositories.CustomPatientRepo;
import com.mds.patientservices.repositories.JpaPatientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommonPatientService {
    @Autowired
    CustomPatientRepo customPatRepo;
    @Autowired
    JpaPatientRepo jpaPatientRepo;
    public List<Patient> getPatients(){
        return customPatRepo.findPatientByFirstNameAndLastName("Vishank", "Rajput");
    }
    public List<Patient> deletePatient(){
    	jpaPatientRepo.deleteById(7);
    	return getPatients();
    }
    public void addPatient(Patient patient) {
    	jpaPatientRepo.save(patient);
    }
}
