package com.day1.review.Service;

import java.util.List;

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
public List<cafeideas> getInfo()
{
	return crepo.findAll();
}
public cafeideas updateInfo(cafeideas iu)
{
	return crepo.saveAndFlush(iu);
}
public void deleteInfo(int cafenum)
{
	crepo.deleteById(cafenum); 
}
}
