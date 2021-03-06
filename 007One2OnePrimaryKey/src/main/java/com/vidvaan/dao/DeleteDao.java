package com.vidvaan.dao;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.vidvaan.bean.Account;
import com.vidvaan.bean.AccountPlus;
import com.vidvaan.one2onepk.util.SessionUtil;



public class DeleteDao {
	public static void main(String[] args) {
		Session session=SessionUtil.getSession();
		session.getTransaction().begin();
		
		Account account=(Account)session.get(Account.class, 1);
		session.delete(account);
		
		session.getTransaction().commit();
		SessionUtil.closeSession(session);
	}
	
}
