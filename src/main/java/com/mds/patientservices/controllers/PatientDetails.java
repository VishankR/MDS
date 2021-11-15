package com.mds.patientservices.controllers;

import com.mds.patientservices.entities.Patient;
import com.mds.patientservices.services.CommonPatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PatientDetails {
    @Autowired
    CommonPatientService patientService;
    @GetMapping("/")
    public List<Patient> getPatients(){
        return patientService.getPatients();
    }
    @GetMapping("/delete")
    public List<Patient> deletePatient(){
    	return patientService.deletePatient();
    }
}
