package com.day1.review.Contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.day1.review.Service.cafeService;
import com.day1.review.databaseex.cafeideas;

@RestController

public class cafeController
{
	
@Autowired

public cafeService cser;

@PostMapping( "/postcafe")
public cafeideas addDetails(@RequestBody cafeideas cr)
{
	return cser.saveInfoo(cr);
}

@GetMapping("/getCafe")
public List <cafeideas> getDetails()
{
	return cser.getInfo();
} 

@PutMapping("/updateCafe")
public cafeideas updateDetails(@RequestBody cafeideas cafenum)
{
	return cser.updateInfo(cafenum);
}

@DeleteMapping("/deleteCafe/{cid}")
public String deleteDetails(@PathVariable ("cid") int cafenum)
{
	cser.deleteInfo(cafenum);
	return "Cafe Number "+cafenum+" is deleted";
}

@DeleteMapping("/deleteByReq")

	public String deleteByRequestPara(@RequestParam("cid") int cafenum)
	{
		cser.deleteInfo(cafenum);
		return "Cafe number "+cafenum+" is deleted"; 
	}
}




