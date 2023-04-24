package com.day1.review.databaseex;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class cafeideas {
	@Id
	private int cafenum;
	private String cafename;
	private String address;
	private String ownername;
	private String opentime;
	private String closetime;
	private String signaturedish;
	private int price;
	private int years;
	private int customersperday;
	
	public String getSignaturedish() {
		return signaturedish;
	}
	public void setSignaturedish(String signaturedish) {
		this.signaturedish = signaturedish;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getYears() {
		return years;
	}
	public void setYears(int years) {
		this.years = years;
	}
	public int getCustomersperday() {
		return customersperday;
	}
	public void setCustomersperday(int customersperday) {
		this.customersperday = customersperday;
	}
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
	public String getOwnername() {
		return ownername;
	}
	public void setOwnername(String ownername) {
		this.ownername = ownername;
	}
	public String getOpentime() {
		return opentime;
	}
	public void setOpentime(String opentime) {
		this.opentime = opentime;
	}
	public String getClosetime() {
		return closetime;
	}
	public void setClosetime(String closetime) {
		this.closetime = closetime;
	}
	
	

}
