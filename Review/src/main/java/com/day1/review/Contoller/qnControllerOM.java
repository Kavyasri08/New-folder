package com.day1.review.Contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.day1.review.Service.qnServOM;
import com.day1.review.databaseex.qnOM;

@RestController
@RequestMapping("/ans")

public class qnControllerOM 
{
	@Autowired
	public qnServOM obj1;
	@PostMapping("")
	public qnOM add(@RequestBody qnOM smodel)
	{
		return obj1.addStudent(smodel);
	}
	@GetMapping("")
	public List<qnOM> get()
	{
		return obj1.getStudent();
	}
	@PutMapping("")
	public qnOM put(@RequestBody qnOM smodel)
	{
		return obj1.putData(smodel);
	}
	@DeleteMapping("/{id}")
	public String delete(@PathVariable int id)
	{
		obj1.deletedata(id);
		return id+"deleted";
		
	}
}
