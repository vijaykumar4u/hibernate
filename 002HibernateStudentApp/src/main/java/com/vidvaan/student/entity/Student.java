package com.vidvaan.student.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Student {
	@Id
	private int rollNo;
	@Column
	private String studentName;
	@Column
	private String baranch;
	@Column
	private double studentFee;

	public Student() {

	}

	public Student(int rollNo, String studentName, String baranch, double studentFee) {
		super();
		this.rollNo = rollNo;
		this.studentName = studentName;
		this.baranch = baranch;
		this.studentFee = studentFee;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getBaranch() {
		return baranch;
	}

	public void setBaranch(String baranch) {
		this.baranch = baranch;
	}

	public double getStudentFee() {
		return studentFee;
	}

	public void setStudentFee(double studentFee) {
		this.studentFee = studentFee;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", studentName=" + studentName + ", baranch=" + baranch + ", studentFee="
				+ studentFee + "]";
	}

	

}
