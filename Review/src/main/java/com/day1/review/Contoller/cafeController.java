package com.day1.review.Contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.day1.review.Service.cafeService;
import com.day1.review.databaseex.cafeideas;
@RestController

public class cafeController
{
@Autowired
public cafeService cser;
@PostMapping("/savecafeideas")
public cafeideas addDetails(@RequestBody cafeideas cr)
{
	return cser.saveInfoo(cr);
}
}


