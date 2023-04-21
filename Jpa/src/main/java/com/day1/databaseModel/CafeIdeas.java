package com.day1.databaseModel;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="cafecollections")
public class CafeIdeas 
{
@Id
@Column(name="cafno")
private int cafenum;
private String cafename;
private String address;
public int getCafenum() {
	return cafenum;
}
public void setCafenum(int cafenum) {
	this.cafenum = cafenum;
}
public String getCafename() {
	return cafename;
}
public void setCafename(String cafename) {
	this.cafename = cafename;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}

}
