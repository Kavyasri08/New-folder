package com.day1.review.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.day1.review.Repository.cafeRepo;
import com.day1.review.databaseex.cafeideas;
@Service

public class cafeService
{
	@Autowired
public cafeRepo crepo;
public cafeideas saveInfoo(cafeideas c)
{
	return crepo.save(c);
}
}
