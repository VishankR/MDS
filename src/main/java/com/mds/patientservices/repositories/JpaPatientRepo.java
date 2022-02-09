package com.mds.patientservices.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.mds.entities.Patient;

public interface JpaPatientRepo extends JpaRepository<Patient, Integer> {

}
