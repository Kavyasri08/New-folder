package com.day1.ValueAnn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootApplication
public class Day14Application {

	public static void main(String[] args)throws JsonProcessingException {
		SpringApplication.run(Day14Application.class, args);
		Person ob=new Person(1,"KAVYA","19");
		ObjectMapper o=new ObjectMapper();
		String json=o.writeValueAsString(ob);
		System.out.println(json);
	}

}
