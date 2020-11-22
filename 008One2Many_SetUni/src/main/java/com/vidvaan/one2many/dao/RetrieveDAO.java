package com.vidvaan.one2many.dao;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Hibernate;
import org.hibernate.Session;

import com.vidvaan.one2many.bean.Department;
import com.vidvaan.one2many.bean.Employee;
import com.vidvaan.one2many.util.SessionUtil;


public class RetrieveDAO {
	public static void main(String[] args) {
		Session session = SessionUtil.getSession();
		session.getTransaction().begin();

		Department department = (Department) session.get(Department.class, 1);
		Hibernate.initialize(department.getEmployeeSet());
		
		session.getTransaction().commit();
		SessionUtil.closeSession(session);
		
		
		sop("Department details are...");
		sop("Dno : " + department.getDno());
		sop("Name : " + department.getName());
		sop("Location : " + department.getLocation());

		Set<Employee> empSet = department.getEmployeeSet();
		sop("\nEmployee details are... ");
		for (Employee employee : empSet) {
			sop("\nEno : " + employee.getEno());
			sop("Name : " + employee.getName());
			sop("Salary : " + employee.getSalary());
		}
	}

	public static void sop(Object object) {
		System.out.println(object);
	}
}
