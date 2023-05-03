package com.day1.review.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.day1.review.Repository.cafeCustrep;

import com.day1.review.databaseex.cafeCust;
import com.day1.review.databaseex.cafeideas;


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

	
}
