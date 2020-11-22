package com.vidvaan.hibernate.serviceclint;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.vidvaan.hibernate.bean.Cars;
import com.vidvaan.hibernate.util.SessionUtil;

public class HqlSelectQueries {
	public static void main(String[] args) {
		Session session = SessionUtil.getSession();
		String hql1 = "select a from Cars a";
		String hql2 = "select a.carName,a.carPrice from Cars a";
		String hql3 = "select max(a.carPrice),min(a.carPrice),avg(a.carPrice) from Cars a";
		String hql4 = "SELECT UPPER(a.carName), LOWER(a.carName) FROM Cars a";
		String hql5 = "SELECT a FROM Cars a WHERE a.brandName LIKE 'H%' AND a.carPrice > 200000";
		String hql6 = "select a.carName, avg(carPrice) from Cars a group by a.carName";
		String hql7 = "from Cars a order by a.carPrice";
		String hql8 = "from Cars a order by a.carPrice, a.carName";

		Query query = session.createQuery(hql1);

		// List carsList = query.list();
//		for (Object object : carsList) {
//			Cars cars = (Cars) object;
//			System.out.println(cars);
//		}
//		Iterator iterator = carsList.iterator();
//		while (iterator.hasNext()) {
//			Object object[] = (Object[]) iterator.next();
//			System.out.println("<===============================>");
//			System.out.println("CarName:" + object[0]);
//			System.out.println("CarPrice:" + object[1]);
//			//System.out.println("CarPrice:" + object[2]);
//			System.out.println("<===============================>");
//
//		}
		///// =======================hql5 code==========================
//		
//
//		List<Cars> carNmaes=	query.list();//hql5 code
//for (Cars cars : carNmaes) {
//	System.out.println(cars);
//}
//		
		/// ==========================hql 6 7 8 ===============================
		List<Cars> grCars = query.list();
		for (Cars cars : grCars) {
			System.out.println(cars.getSrNo());
			System.out.println(cars.getCarName());
			System.out.println(cars.getBrandName());
			System.out.println(cars.getCarPrice());
		}
		session.close();
	}

}
