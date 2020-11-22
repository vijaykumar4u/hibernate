package com.vidvaan.flight.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Flight {
	
	@Id
	private int fNo;
	@Column
	private String fName;
	@Column
	private double fPrice;
	public Flight() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Flight(int fNo, String fName, double fPrice) {
		super();
		this.fNo = fNo;
		this.fName = fName;
		this.fPrice = fPrice;
	}
	public int getfNo() {
		return fNo;
	}
	public void setfNo(int fNo) {
		this.fNo = fNo;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public double getfPrice() {
		return fPrice;
	}
	public void setfPrice(double fPrice) {
		this.fPrice = fPrice;
	}
	@Override
	public String toString() {
		return "Flight [fNo=" + fNo + ", fName=" + fName + ", fPrice=" + fPrice + "]";
	}


}
