package com.vidvaan.one2One.bean;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table

public class Student {
	@Id
	@GenericGenerator(name = "myGen",strategy = "increment")
	@GeneratedValue(strategy = GenerationType.AUTO,generator = "myGen")
	private int rollNo;
	@Column
	private String studentName;
	@Column
	private String branch;
	@Column
	private double fee;
	@OneToOne(cascade = CascadeType.ALL)//line 24 i clintTest
	private Address address;

	public Student() {

	}

	public Student(String studentName, String branch, double fee, Address address) {
		super();
		this.studentName = studentName;
		this.branch = branch;
		this.fee = fee;
		this.address = address;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", studentName=" + studentName + ", branch=" + branch + ", fee=" + fee
				+ ", address=" + address + "]";
	}

}
