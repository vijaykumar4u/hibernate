package com.vidvaan.dao;
import org.hibernate.Transaction;

import com.vidvaan.bean.Account;
import com.vidvaan.bean.AccountPlus;
import com.vidvaan.one2onepk.util.SessionUtil;

import org.hibernate.Session;
public class CreateDao {
	public static void main(String[] args) {
		Session session=SessionUtil.getSession();
		Transaction transaction =session.beginTransaction();
		
		AccountPlus accountPlus=new AccountPlus();
		accountPlus.setLocation("hyd");
		accountPlus.setType("savings");
		
		Account account=new Account();
		account.setName("sekhar");
		account.setBal(5000);
		account.setPlus(accountPlus);
		
		session.save(account);
		
		transaction.commit();
		SessionUtil.closeSession(session);
		}
}
