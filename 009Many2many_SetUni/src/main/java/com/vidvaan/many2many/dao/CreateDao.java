package com.vidvaan.many2many.dao;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.vidvaan.many2many.bean.Course;
import com.vidvaan.many2many.bean.StudentMany2Many;
import com.vidvaan.many2many.util.SessionUtil;

public class CreateDao {
	public static void main(String[] args) {
		Session session = SessionUtil.getSession();
		Transaction transaction = session.getTransaction();
		transaction.begin();
		Course course1 = new Course();
		course1.setCname("Hibernate");
		Course course2 = new Course();
		course2.setCname("SPRING");
		Set<Course> cSet = new HashSet<Course>();
		cSet.add(course1);
		cSet.add(course2);
		StudentMany2Many studentMany2Many1 = new StudentMany2Many();
		studentMany2Many1.setSname("Vijay");

		StudentMany2Many studentMany2Many2 = new StudentMany2Many();
		studentMany2Many2.setSname("Kumar");
		studentMany2Many1.setCourses(cSet);
		studentMany2Many2.setCourses(cSet);
		session.save(studentMany2Many1);
		session.save(studentMany2Many2);
		transaction.commit();
		session.close();

	}

}
