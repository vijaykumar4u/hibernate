package com.vidvaan.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
@Table(name="Account")
public class Account {

	private long accno;
	private String name;
	private double balance;
	private Date creationDate;
	@Id
	@Column(name = "Accno",nullable = true,length = 10)
	public long getAccno() {
		return accno;
	}
	public void setAccno(long accno) {
		this.accno = accno;
	}
	@Column(name = "Name",nullable = false,length = 30)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Column(name = "Bal" ,nullable = false,precision = 8,scale = 2)
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Temporal(TemporalType.DATE)
	@Column(name = "Creation_Date",nullable = false)
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	@Override
	public String toString() {
		return "Account [accno=" + accno + ", name=" + name + ", balance=" + balance + ", creationDate=" + creationDate
				+ "]";
	}
	
}

