 package com.day1.review.Contoller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.day1.review.Service.cafeLoginser;
import com.day1.review.databaseex.cafeLogin;

@RestController
@RequestMapping("/user")
public class cafeLogincont 
{
@Autowired
private cafeLoginser lser;
@PostMapping("/login")
public String login(@RequestBody Map<String,String>loginData)
{
	String usrname=loginData.get("usrname");
	String psword=loginData.get("psword");
	String result=lser.checkLogin(usrname,psword);
	return result;
}
@PostMapping("/adduser")
public cafeLogin AddUser(@RequestBody cafeLogin cl)
{
	return lser.addUser(cl);
}

@GetMapping
public List<cafeLogin> listAll()
{
	return lser.getUser();
}

}
