package com.vidvaan.service;

import java.util.Date;

import com.vidvaan.bean.Account;
import com.vidvaan.dao.AccountDAO;

public class AccountService {
	public static void main(String[] args) {
		AccountDAO accountDAO = new  AccountDAO();
		
		
		  //create Record 
			/*
			 * Account insertAccount = new Account(); insertAccount.setAccno(10004);
			 * insertAccount.setName("Meeku"); insertAccount.setBalance(4554455);
			 * insertAccount.setCreationDate(new Date()); accountDAO.insert(insertAccount);
			 * System.out.println("Account created Susccessfully");
			 */
		 
		
//		    Account retiveAccount=accountDAO.getById(10001);
//		  System.out.println("Account Details");
//		  System.out.println("AccNo:"+retiveAccount.getAccno());
//		  System.out.println("AccName:"+retiveAccount.getName());
//		  System.out.println("AccBal:"+retiveAccount.getBalance());
//		  System.out.println("AccDate:"+retiveAccount.getCreationDate());
		  //deleteing record
		  
		//  accountDAO.delete(10002); System.out.println("record deleted");
		  
		System.out.println("All Details");
		accountDAO.getAll();
		
	}
	
	
	

}
