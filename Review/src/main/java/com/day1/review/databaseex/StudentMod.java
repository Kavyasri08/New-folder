package com.day1.review.databaseex;



import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class StudentMod 
{
	@Id
	private int studentid;
	private String studentname;
	private int studentage;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn
	private StudentAdd saddress;
	public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public int getStudentage() {
		return studentage;
	}
	public void setStudentage(int studentage) {
		this.studentage = studentage;
	}
	public StudentAdd getSaddress() {
		return saddress;
	}
	public void setSaddress(StudentAdd saddress) {
		this.saddress = saddress;
	}
}
