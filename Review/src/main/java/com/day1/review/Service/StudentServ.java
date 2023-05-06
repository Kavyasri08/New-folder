package com.day1.review.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.day1.review.Repository.StudentRep;
import com.day1.review.databaseex.StudentMod;


@Service
public class StudentServ 
{
	@Autowired
	public StudentRep srepo;
	
	public StudentMod addStudent(StudentMod smodel) {
		return srepo.save(smodel);
	}
	
	public List<StudentMod> getStudent(){
		return srepo.findAll();
	}
	
	public StudentMod putdata(StudentMod smodel) {
		return srepo.saveAndFlush(smodel);
	}
	
	public void deletedata(int studentid) {
		srepo.deleteById(studentid);
	}
}
