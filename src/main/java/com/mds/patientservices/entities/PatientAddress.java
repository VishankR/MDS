package com.mds.patientservices.entities;

import javax.persistence.Embeddable;

@Embeddable
public class PatientAddress {

	private String city;
	
	private String state;
	
	private String street;
	
	//private int patient_id;

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public String getStreet() {
		return street;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setStreet(String street) {
		this.street = street;
	}
	
	/*
	 * public int getPatient_id() { return patient_id; }
	 * 
	 * public void setPatient_id(int patient_id) { this.patient_id = patient_id; }
	 */

	@Override
	public String toString() {
		return "PatientAddress [street=" + street + ", city=" + city + ", state=" + state + "]";
	}
	
}
