package com.vidvaan.one2many.dao;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;

import com.vidvaan.one2many.bean.Department;
import com.vidvaan.one2many.bean.Employee;
import com.vidvaan.one2many.util.SessionUtil;



public class CreateDAO {
	public static void main(String[] args) {
		Session session = SessionUtil.getSession();
		session.getTransaction().begin();

		Employee employee1 = new Employee();
		employee1.setName("kesavareddy");
		employee1.setSalary(4600);

		Employee employee2 = new Employee();
		employee2.setName("yellareddy");
		employee2.setSalary(5800);

		Employee employee3 = new Employee();
		employee3.setName("cherry");
		employee3.setSalary(5900);

		Set<Employee> empSet = new HashSet<Employee>();
		empSet.add(employee1);
		empSet.add(employee2);
		empSet.add(employee3);

		Department department = new Department();
		department.setName("Agriculture");
		department.setLocation("Gunipalli");
		department.setEmployeeSet(empSet);

		session.save(department);

		session.getTransaction().commit();
		SessionUtil.closeSession(session);
	}
}
