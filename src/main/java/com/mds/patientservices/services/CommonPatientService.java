package com.mds.patientservices.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mds.entities.Patient;
import com.mds.patientservices.repositories.CustomPatientRepo;
import com.mds.patientservices.repositories.JpaPatientRepo;

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
