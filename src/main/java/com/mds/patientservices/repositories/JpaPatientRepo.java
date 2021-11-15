package com.mds.patientservices.repositories;


import com.mds.patientservices.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaPatientRepo extends JpaRepository<Patient, Integer> {

}
