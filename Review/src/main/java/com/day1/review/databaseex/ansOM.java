package com.day1.review.databaseex;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class ansOM 
{
	@Id
	private int ano;
	private String answer;
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
}
