package com.vidvaan.one2onepk.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionUtil {
	
	private static SessionFactory sFactory = null;

	static {
		Configuration configuration = new Configuration();
		sFactory = configuration.configure("one_to_onepk.cfg.xml").buildSessionFactory();

	}

	public static Session getSession() {
		return sFactory.openSession();
	}

	public static void closeSession(Session session) {
		if (session != null) {
			session.close();
		}
	}
	
	public static void main(String[] args) {
		System.out.println(getSession());
	}

}
