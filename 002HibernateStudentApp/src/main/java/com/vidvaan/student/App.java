package com.vidvaan.student;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.ReplicationMode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.vidvaan.student.entity.Student;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		// Student student = new Student(245, "Vivek", "MBA", 750000);
		Configuration configuration = new Configuration();
		SessionFactory sessionFactory = configuration.configure("com/vidvaan/student/config/student.cgg.xml")
				.buildSessionFactory();
		Session session = sessionFactory.openSession();
		// session.save(student);
		// session.beginTransaction().commit();
//		Query query = session.createQuery("from Student");
//		List<Student> result = query.list();
//		for (Student student : result) {
//
//			System.out.println(student);
//		}
//	Student student1=	(Student) session.get(Student.class, 1);
//	System.out.println(student1.getRollNo());
//	System.out.println(student1.getStudentName());
		//session.close();
		//-------------------------Session Methods Practise--------------------
	Student student=	(Student) session.get(Student.class, 207);
	System.out.println("After Get Method");
	if(session.contains(student)) {
		System.out.println("Obj is associated with session");
	}else {
		System.out.println("Obj is Not Associated");
	}
	System.out.println(student);
	System.out.println();
	session.evict(student);
	if(session.contains(student)) {
		System.out.println("Obj is associated with session");
	}else {
		System.out.println("Obj is Not Associated");
	}
	session.replicate(student, ReplicationMode.LATEST_VERSION);
	System.out.println("After Repllicate Mode");
	if(session.contains(student)) {
		System.out.println("Obj is associated with session");
	}else {
		System.out.println("Obj is Not Associated");
	}
	session.beginTransaction().commit();
	session.close();
	}
}