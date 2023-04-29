package com.day1.review.databaseex;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity

public class cafeLogin 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private int sno;
private String usrname;
private String psword;
public int getSno() {
	return sno;
}
public void setSno(int sno) {
	this.sno = sno;
}
public String getUsrname() {
	return usrname;
}
public void setUsrname(String usrname) {
	this.usrname = usrname;
}
public String getPsword() {
	return psword;
}
public void setPsword(String psword) {
	this.psword = psword;
}
}
