package com.skct.day1.classEx1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Welcome 
{
	@GetMapping("/welcome")
	@ResponseBody
public String Welcome()
{
	return "Welcome to RESTApi class";
}
}
