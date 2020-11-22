package com.vidvaan.bean;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name = "ACCOUNT")
public class Account {
	@Id
	@GenericGenerator(name = "myGenerator", strategy = "foreign", parameters = @Parameter(name = "property", value = "plus"))
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "myGenerator")
	@Column(name = "ACCNO")
	private int accno;
	@Column(name = "NAME")
	private String name;
	@Column(name = "BALANCE")
	private double bal;

	@OneToOne(cascade = CascadeType.REMOVE, fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	private AccountPlus plus;

	public int getAccno() {
		return accno;
	}

	public void setAccno(int accno) {
		this.accno = accno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBal() {
		return bal;
	}

	public void setBal(double bal) {
		this.bal = bal;
	}

	public AccountPlus getPlus() {
		return plus;
	}

	public void setPlus(AccountPlus plus) {
		this.plus = plus;
	}

}
