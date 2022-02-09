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
    public static PatientAddress getDummyPatientAddress(){
        PatientAddress patAdd = new PatientAddress();
        patAdd.setCity("Bijnor");
        patAdd.setStreet("H.No. - 14, Karimpur Nangli");
        patAdd.setState("UP");
        return patAdd;
    }
    public static List<PatientAddress> getDummyPatientAddressList(){
        List<PatientAddress> temp = new ArrayList<>();
        PatientAddress patAdd = new PatientAddress();
        patAdd.setCity("Bijnor");
        patAdd.setStreet("H.No. - 14, Karimpur Nangli");
        patAdd.setState("UP");
        temp.add(patAdd);
        return temp;
    }
    public static Prescription getDummyPrescription(Patient pat, List<PrescriptionFill> presFill){
        Prescription patPres = new Prescription();
        patPres.setDays(30);
        patPres.setDispensedQuantity(30);
        patPres.setDrugName("Paracetamol");
        patPres.setPatient(pat);
        patPres.setPrescribedQuantity(90);
        //patPres.setPresFill(presFill);
        patPres.setRefillQuantity(30);
        patPres.setRefills(2);
        return patPres;
    }
    public static List<Prescription> getDummyPrescriptionList(Patient pat, List<PrescriptionFill> presFill){
        List<Prescription> temp = new ArrayList<>();
        Prescription patPres = new Prescription();
        patPres.setDays(30);
        patPres.setDispensedQuantity(30);
        patPres.setDrugName("Paracetamol");
        patPres.setPatient(pat);
        patPres.setPrescribedQuantity(90);
        patPres.setPresFill(presFill);
        presFill.forEach(tempPresFill -> tempPresFill.setPres(patPres));
        patPres.setRefillQuantity(30);
        patPres.setRefills(2);
        temp.add(patPres);
        return temp;
    }
    public static PrescriptionFill getDummyPrescriptionFill(){
        PrescriptionFill patPresFill = new PrescriptionFill();
        patPresFill.setDays(30);
        patPresFill.setDispensedQuantity(30);
        patPresFill.setFillNumber(0);
        patPresFill.setPickupDate(new Date());
        //patPresFill.setPres(pres);
       // patPresFill.setRefill_number(0);
        return patPresFill;
    }
    public static List<PrescriptionFill> getDummyPrescriptionFillList(){
        List<PrescriptionFill> temp = new ArrayList<>();
        PrescriptionFill patPresFill = new PrescriptionFill();
        patPresFill.setDays(30);
        patPresFill.setDispensedQuantity(30);
        patPresFill.setFillNumber(0);
        patPresFill.setPickupDate(new Date());
        //patPresFill.setRefill_number(0);
        temp.add(patPresFill);
        return temp;
    }
    public static List<PrescriptionFill> getDummyPrescriptionFillListWithPrescription(Prescription pres){
        List<PrescriptionFill> temp = new ArrayList<>();
        PrescriptionFill patPresFill = new PrescriptionFill();
        patPresFill.setDays(30);
        patPresFill.setDispensedQuantity(30);
        patPresFill.setFillNumber(2);
        patPresFill.setPickupDate(new Date());
       // patPresFill.setRefill_number(1);
        patPresFill.setPres(pres);
        temp.add(patPresFill);
        return temp;
    }
    public static Contact getDummyPatientContact(){
        Contact patContact = new Contact();
        patContact.setMobileContact("8510964757");
        return patContact;
    }
    public static Patient getDummyPatient(){
        Patient pat= new Patient();
        pat.setAddress(getDummyPatientAddressList());
        //pat.setAge(25);
        pat.setBirthDate(new Date(1998, Calendar.JANUARY, 5));
        pat.setContact(getDummyPatientContact());
        pat.setFirstName("Vishank");
        pat.setLastName("Rajput");
        pat.setGender("Male");
        pat.setContact(getDummyPatientContact());
        pat.setMail("vishankkumar@gmail.com");
        pat.setValid(true);
        return pat;
    }
}
