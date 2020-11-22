package com.vidvaan.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.vidvaan.bean.Account;
import com.vidvaan.util.SessionUtil;

public class AccountDAO {
	Session session = null;
	

	public Account getById(long accNo) {
		Account	 account=null;
		try {

			Session session = SessionUtil.getSession();
		account = (Account) session.get(Account.class, accNo);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			SessionUtil.closeSession(session);
		}
		return account;
		

	}

	public void insert(Account account) {
		try {
			Session session = SessionUtil.getSession();
			session.save(account);
			session.beginTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			SessionUtil.closeSession(session);
		}
	}

	public void update(Account account) {
		try {
			 session = SessionUtil.getSession();
			session.update(account);
			session.beginTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			SessionUtil.closeSession(session);
		}
	}

	public void delete(long accNo) {
		Account account = null;

		try {
			 session = SessionUtil.getSession();
			
			 account = (Account) session.get(Account.class, accNo);
			session.delete(account);
			session.beginTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			SessionUtil.closeSession(session);
		}
	}
	public List<Account> getAll(){
		
		session=SessionUtil.getSession();
		Query query = session.createQuery("from Account");
	List<Account> accountList=	query.list();
		for (Account account : accountList) {
			
			System.out.println(account);
		}
		return accountList;
		
		
		
		
		
	}

}
