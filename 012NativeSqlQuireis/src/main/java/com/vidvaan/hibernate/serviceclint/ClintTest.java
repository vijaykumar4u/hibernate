package com.vidvaan.hibernate.serviceclint;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.vidvaan.hibernate.bean.Cars;
import com.vidvaan.hibernate.util.SessionUtil;

public class ClintTest {
	public static void main(String[] args) {
		Cars cars = new  Cars();
		cars.setCarName("Brezza");
		cars.setBrandName("suzuki");
		cars.setCarPrice(900000);
Session	session=	SessionUtil.getSession();
		session.save(cars);
		session.beginTransaction().commit();
		session.close();
	}

}
