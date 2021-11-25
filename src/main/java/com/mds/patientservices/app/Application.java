/*
 * package com.mds.patientservices.app;
 * 
 * import com.mds.patientservices.entities.Patient; import
 * com.mds.patientservices.mockData.Data; import
 * com.mds.patientservices.utils.HibernateUtil;
 * 
 * import org.hibernate.Session; import org.hibernate.Transaction;
 * 
 * import java.util.List;
 * 
 * import javax.persistence.EntityManager; import
 * javax.persistence.PersistenceContext;
 * 
 * 
 * public class Application { public static void main(String[] args) {
 * 
 * 
 * Session session = HibernateUtil.getSessionFactory().openSession();
 * Transaction tx = session.beginTransaction();
 * 
 * session.save(Data.getDummyPatient());
 * 
 * 
 * Patient p = session.get(Patient.class, 6); session.delete(p);
 * 
 * Patient p = session.get(Patient.class, 5); List<Prescription> presList =
 * Data.getDummyPrescriptionList(p, Data.getDummyPrescriptionFillList());
 * presList.forEach(session::save);
 * 
 * Prescription pres = session.get(Prescription.class, 8);
 * List<PrescriptionFill> presFillList =
 * Data.getDummyPrescriptionFillListWithPrescription(pres);
 * presFillList.forEach(session::save); Patient p = session.get(Patient.class,
 * 7); System.out.println(p.toString());
 * 
 * tx.commit(); session.close();
 * 
 * } }
 */