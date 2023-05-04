package com.day1.review.Contoller;



import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.day1.review.Service.cafeCustser;

import com.day1.review.databaseex.cafeCust;


@RestController
public class cafeCustcon 
{
	@Autowired

	public cafeCustser oser;

	@PostMapping( "/postt")
	public cafeCust addDe(@RequestBody cafeCust crc)
	{
		return oser.saveDe(crc);
	}
	@GetMapping("/getCa")
	public List <cafeCust> getDe()
	{
		return oser.getinfoDe();
	} 
	@PostMapping("/register")
	public String login(@RequestBody Map<String,String>loginData)
	{
		String username=loginData.get("username");
		String password=loginData.get("password");
		String result=oser.checkLogin(username,password);
		return result;
	}//To add details
	

	
}
