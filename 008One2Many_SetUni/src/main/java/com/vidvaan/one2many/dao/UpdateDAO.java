package com.vidvaan.one2many.dao;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.hibernate.Session;

import com.vidvaan.one2many.bean.Department;
import com.vidvaan.one2many.bean.Employee;
import com.vidvaan.one2many.util.SessionUtil;


public class UpdateDAO {
	public static void main(String[] args) {
		Session session = SessionUtil.getSession();
		session.getTransaction().begin();

		Department department = (Department) session.get(Department.class, 1);
		department.setName("IT");
		Set<Employee> empSet = department.getEmployeeSet();
		Iterator<Employee> iterator = empSet.iterator();
		while (iterator.hasNext()) {
			Employee employee = iterator.next();
			if (employee.getSalary() > 5200) {
				employee.setSalary(employee.getSalary() + 1000);
			}
		}
		
		session.getTransaction().commit();
		SessionUtil.closeSession(session);
	}
}
