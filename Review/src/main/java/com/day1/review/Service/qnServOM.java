package com.day1.review.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.day1.review.Repository.qnRepoOM;
import com.day1.review.databaseex.qnOM;

@Service

public class qnServOM 
{
	@Autowired
	public qnRepoOM obj;
	public qnOM addStudent(qnOM smodel)
	{
		return obj.save(smodel);
	}
	public List<qnOM>getStudent()
	{
		return obj.findAll();
	}
	public qnOM putData(qnOM smodel)
	{
		return obj.saveAndFlush(smodel);
	}
   public void deletedata(int studentid)
   {
	   obj.deleteById(studentid);
   }
}
