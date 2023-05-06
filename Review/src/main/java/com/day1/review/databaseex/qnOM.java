package com.day1.review.databaseex;

import java.util.List;



import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
@Entity
public class qnOM 
{
	@Id
	  private int qno;
	  private String qname;
	  @OneToMany(cascade = CascadeType.ALL)
	  @JoinColumn
	  private List<ansOM> answer;
	public int getQno() {
		return qno;
	}
	public void setQno(int qno) {
		this.qno = qno;
	}
	public String getQname() {
		return qname;
	}
	public void setQname(String qname) {
		this.qname = qname;
	}
	public List<ansOM> getAnswer() {
		return answer;
	}
	public void setAnswer(List<ansOM> answer) {
		this.answer =answer;
	}
}
