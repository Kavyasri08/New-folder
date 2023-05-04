package com.day1.review.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.day1.review.Repository.cafeCustrep;

import com.day1.review.databaseex.cafeCust;



@Service
public class cafeCustser 
{
	@Autowired
	public cafeCustrep rrepo;
	public cafeCust saveDe(cafeCust cc)
	{
		return rrepo.save(cc);
	}
	public List<cafeCust> getinfoDe()
	{
		return rrepo.findAll();
	}
	
	public String checkLogin(String username,String password)
	{
		cafeCust user= rrepo.findByusername(username);
		if(user==null)
		{
			return "No Registered user found";
		}
		else
		{
			if(user.getPassword().equals(password))
			{
				return "Registration Succesfull";
			}
			else
			{
				return "Registration Failed";
			}
		}
	} 
	
	

	
}
