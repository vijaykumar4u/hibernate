package com.vidvaan.one2many.dao;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;

import com.vidvaan.one2many.bean.Department;
import com.vidvaan.one2many.bean.Employee;
import com.vidvaan.one2many.util.SessionUtil;

public class DeleteDAO {
	public static void main(String[] args) {
		Session session=SessionUtil.getSession();
		session.getTransaction().begin();
		
		Department department=(Department)session.get(Department.class, 1);
		session.delete(department);
		
		session.getTransaction().commit();
		SessionUtil.closeSession(session);
	}
}
