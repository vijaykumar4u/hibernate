package com.vidvaan.one2One.bean;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int addPincode;
	@Column
	private String locality;
	@Column
	private String city;
	@OneToOne(mappedBy = "address") // use mapped by to remove extra student column
	// from address in bi direction
	private Student student;

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Address() {

	}

	public Address(String locality, String city) {

		this.locality = locality;
		this.city = city;
	}

	public int getAddPincode() {
		return addPincode;
	}

	public void setAddPincode(int addPincode) {
		this.addPincode = addPincode;
	}

	public String getLocality() {
		return locality;
	}

	public void setLocality(String locality) {
		this.locality = locality;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [addPincode=" + addPincode + ", locality=" + locality + ", city=" + city + ", student="
				+ student + "]";
	}

}
