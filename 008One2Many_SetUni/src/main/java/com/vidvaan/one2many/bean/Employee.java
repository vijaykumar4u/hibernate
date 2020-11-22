package com.vidvaan.one2many.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "EMP")
public class Employee {
	@Id
	@GenericGenerator(name = "myGenerator", strategy = "increment")
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "myGenerator")
	@Column(name = "ENO")
	private int eno;
	@Column(name = "NAME")
	private String name;
	@Column(name = "SAL")
	private double salary;

	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
