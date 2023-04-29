package com.day1.review.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.day1.review.Repository.cafeLoginrepo;
import com.day1.review.databaseex.cafeLogin;

@Service
public class cafeLoginser 
{
	@Autowired
	private cafeLoginrepo lrepo;
	public String checkLogin(String usrname,String psword)
	{
		cafeLogin user= lrepo.findByusrname(usrname);
		if(user==null)
		{
			return "No user found";
		}
		else
		{
			if(user.getPsword().equals(psword))
			{
				return "Login Succesfull";
			}
			else
			{
				return "Login Failed";
			}
		}
	} 
	public cafeLogin addUser(cafeLogin cl)
	{
		return lrepo.save(cl);
	}
	public List<cafeLogin> getUser()
	{
		return lrepo.findAll();
	}

}
