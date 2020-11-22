package com.vidvaan.hibernate.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Cars {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int srNo;
	@Column
	private String carName;
	@Column
	private String brandName;
	@Column
	private double carPrice;

	public Cars() {

	}

	public int getSrNo() {
		return srNo;
	}

	public void setSrNo(int srNo) {
		this.srNo = srNo;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public double getCarPrice() {
		return carPrice;
	}

	public void setCarPrice(double carPrice) {
		this.carPrice = carPrice;
	}

	@Override
	public String toString() {
		return "Cars [srNo=" + srNo + ", carName=" + carName + ", brandName=" + brandName + ", carPrice=" + carPrice
				+ "]";
	}

}
