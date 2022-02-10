package com.mds.commonservices.mockData;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import com.mds.entities.Contact;
import com.mds.entities.Patient;
import com.mds.entities.PatientAddress;
import com.mds.entities.Prescription;
import com.mds.entities.PrescriptionFill;

public class Data {

	public static List<PatientAddress> getDummyPatientAddressList() {
		List<PatientAddress> temp = new ArrayList<>();
		PatientAddress patAdd = new PatientAddress();
		patAdd.setCity("Bijnor");
		patAdd.setStreet("H.No. - 14, Karimpur Nangli");
		patAdd.setState("UP");
		temp.add(patAdd);
		return temp;
	}

	public static List<Prescription> getDummyPrescriptionList(List<PrescriptionFill> presFillList) {
		List<Prescription> temp = new ArrayList<>();
		Prescription patPres = new Prescription();
		patPres.setDays(30);
		patPres.setDispensedQuantity(30);
		patPres.setDrugName("Paracetamol");
		patPres.setPrescribedQuantity(90);
		patPres.setPresFillList(presFillList);
		patPres.setRefillQuantity(30);
		patPres.setRefills(2);
		temp.add(patPres);
		return temp;
	}

	public static List<PrescriptionFill> getDummyPrescriptionFillList() {
		List<PrescriptionFill> temp = new ArrayList<>();
		PrescriptionFill patPresFill = new PrescriptionFill();
		patPresFill.setDays(30);
		patPresFill.setDispensedQuantity(30);
		patPresFill.setFillNumber(0);
		patPresFill.setPickupDate(new Date());
		patPresFill.setFillNumber(0);
		temp.add(patPresFill);
		return temp;
	}

	public static List<PrescriptionFill> getDummyPrescriptionFillListWithPrescription(Prescription pres) {
		List<PrescriptionFill> temp = new ArrayList<>();
		PrescriptionFill patPresFill = new PrescriptionFill();
		patPresFill.setDays(30);
		patPresFill.setDispensedQuantity(30);
		patPresFill.setFillNumber(2);
		patPresFill.setPickupDate(new Date());
		patPresFill.setFillNumber(1);
		patPresFill.setPres(pres);
		temp.add(patPresFill);
		return temp;
	}

	public static Contact getDummyPatientContact() {
		Contact patContact = new Contact();
		patContact.setMobileContact("8510964757");
		return patContact;
	}

	public static Patient getDummyPatient() {
		Patient pat = new Patient();
		pat.setAddress(getDummyPatientAddressList());
		pat.setBirthDate(new Date(1998, Calendar.JANUARY, 5));
		pat.setContact(getDummyPatientContact());
		pat.setFirstName("Vishank");
		pat.setLastName("Rajput");
		pat.setGender("Male");
		pat.setMail("vishankkumar@gmail.com");
		pat.setValid(true);
		pat.setPres(getDummyPrescriptionList(getDummyPrescriptionFillList()));
		return pat;
	}
}
