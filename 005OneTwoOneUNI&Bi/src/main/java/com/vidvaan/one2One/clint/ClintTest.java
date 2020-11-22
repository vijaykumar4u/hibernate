package com.vidvaan.one2One.clint;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.vidvaan.one2One.bean.Address;
import com.vidvaan.one2One.bean.Student;

public class ClintTest {
	public static void main(String[] args) {

		Configuration configuration = new Configuration();
		SessionFactory sessionFactory = configuration.configure("one_to_one.cfg.xml").buildSessionFactory();
//	System.out.println(sessionFactory.openSession());
		Session session = sessionFactory.openSession();
		// Address address = new Address("Sanantonio", "Texas");
		// Student student = new Student("Ka paul ", "Precher", 45000000, address);
		// Transaction transaction = session.beginTransaction();
		// session.save(address); we dont need to save address saving student
		// is enough only if u use annotation @onetoone(cascade)
		// session.save(student);
		// session.beginTransaction().commit();
		// transaction.commit();
		// session.close();

		// ===========Fetching the records=================

//		Query query =  session.createQuery("from Student");
//		List<Student> slist=query.list();
//		for (Student student : slist) {
//			
//			System.out.println(student);
//		}
		//=================One2One Bi============
		Address address = new Address("LA", "California");
		Student student = new Student("Vaas", "Software engineer", 758852, address);
		address.setStudent(student);//havae to set student also
		session.save(student);
		session.beginTransaction().commit();
		session.close();
		
	}

}
