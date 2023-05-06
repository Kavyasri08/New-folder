package com.day1.review.Contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.day1.review.Service.StudentServ;
import com.day1.review.databaseex.StudentMod;

@RestController
public class StudentControl 
{
	@Autowired
	public StudentServ sserv;
	
	@PostMapping("/poststudent")
	
	public StudentMod add(@RequestBody  StudentMod smodel) {
		return sserv.addStudent(smodel);
	}
	
	@GetMapping("/getstudent")
	
	public List<StudentMod> get(){
		return sserv.getStudent();
	}
	
	@PutMapping("/putstudent")
	
	public StudentMod put( @RequestBody  StudentMod smodel) {
		return sserv.putdata(smodel);
	}
	
	@DeleteMapping("/deletestudent")
	
	public String delete( @RequestParam int studentid) {
		 sserv.deletedata(studentid);
		 return studentid+" deleted";
	}
}
