package com.day1.ValueAnn;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Person 
{
	int pid;
	String pname;
	@JsonIgnore
	String page;
	public Person(int pid, String pname, String page) {
		super();
		this.pid = pid;
		this.pname = pname;
		
		
		this.page = page;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPage() {
		return page;
	}
	public void setPage(String page) {
		this.page = page;
	}
	

}
