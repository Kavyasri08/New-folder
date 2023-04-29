package com.review1.project.Controller;

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

import com.review1.project.Model.CafeModel;
import com.review1.project.Service.CafeService;


@RestController
public class CafeController
{
	@Autowired

	public CafeService cser;

	@PostMapping( "/postcafee")
	public CafeModel addDetails(@RequestBody CafeModel cr)
	{
		return cser.saveInfoo(cr);
	}

	@GetMapping("/getCafee")
	public List <CafeModel> getDetails()
	{
		return cser.getInfo();
	} 

	@PutMapping("/updateCafee")
	public CafeModel updateDetails(@RequestBody CafeModel cafenum)
	{
		return cser.updateInfo(cafenum);
	}

	@DeleteMapping("/deleteCafee/{cid}")
	public String deleteDetails(@PathVariable ("cid") int cafenum)
	{
		cser.deleteInfo(cafenum);
		return "Cafe Number "+cafenum+" is deleted";
	}

	@DeleteMapping("/deleteByReqq")

		public String deleteByRequestPara(@RequestParam("cid") int cafenum)
		{
			cser.deleteInfo(cafenum);
			return "Cafe number "+cafenum+" is deleted"; 
		}
}
