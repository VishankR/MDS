package com.mds.patientservices.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mds.entities.Patient;
import com.mds.patientservices.services.CommonPatientService;

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
    @PostMapping("/add")
    public void addPatient(@RequestBody Patient patient) {
    	patientService.addPatient(patient);
    }
}
