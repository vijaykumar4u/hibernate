package com.vidvaan.flight.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.vidvaan.flight.entity.Flight;

public class FlightTest {
	public static void main(String[] args) {
		// Flight flight = new Flight(123, "Emirates", 100000);
		Configuration configuration = new Configuration();
		SessionFactory sessionFactory = configuration.configure("com/vidvaan/flight/config/flight.cgg.xml")
				.buildSessionFactory();
		Session session = sessionFactory.openSession();
//		session.save(flight);
//		session.beginTransaction().commit();
		Flight flight = (Flight) session.get(Flight.class, 123);
		System.out.println(flight);
		
		


		// fetching the same data again
		Session session2 = sessionFactory.openSession();
		Flight flight2 = (Flight) session2.get(Flight.class, 123);
		System.out.println(flight2);

		session.close();
	}

}
