package com.vidvaan.hibernate.clint;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.vidvaan.hibernate.entity.Account;

public class AccountTest {
	public static void main(String[] args) {
		//Account account = new Account(104, "Vijay", 65000);
		Configuration configuration = new Configuration();
		SessionFactory sessionFactory = configuration.configure("com/vidvaan/hibernate/config/account.cfg.xml").
				buildSessionFactory();
	Session session = sessionFactory.openSession();
		//session.save(account);
		//session.beginTransaction().commit();
	Query query =  session.createQuery("from Account");
List<Account>	acconts=query.list();
for (Account account : acconts) {
	
	System.out.println(account);
	
}
	
		session.close();
	}

}
