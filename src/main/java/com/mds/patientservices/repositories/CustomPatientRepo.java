package com.mds.patientservices.repositories;

import java.util.List;

import com.mds.patientservices.entities.Patient;

public interface CustomPatientRepo {
    public List<Patient> findPatientByFirstNameAndLastName(String firstName, String lastName);
}
