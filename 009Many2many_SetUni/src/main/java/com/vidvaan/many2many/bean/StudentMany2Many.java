package com.vidvaan.many2many.bean;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.IndexColumn;
@Entity
@Table(name = "STUDENT")
public class StudentMany2Many {
	@Id
	@GenericGenerator(name = "myGenGenarator",strategy = "increment")
	@GeneratedValue(strategy = GenerationType.AUTO,generator = "myGenGenarator")
	@Column(name = "SNO")
	private int sno;
	@Column(name = "SNAME")
	private String sname;
	@ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinTable(
			name = "STUDENT_COURSE", 
			joinColumns = { 
					@JoinColumn(name = "S_NO",	referencedColumnName = "SNO")}, 
			inverseJoinColumns = { 
					@JoinColumn(name = "C_NO", referencedColumnName = "CNO") })
	@IndexColumn(name = "ID_COL")
	private Set<Course> courses;
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Set<Course> getCourses() {
		return courses;
	}
	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}
	@Override
	public String toString() {
		return "StudentMany2Many [sno=" + sno + ", sname=" + sname + ", courses=" + courses + "]";
	}
	
	
		
	

}
