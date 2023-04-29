package com.review1.project.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.review1.project.Model.CafeModel;
import com.review1.project.Repository.CafeRepository;


@Service
public class CafeService 
{
	public CafeRepository crepo;
	public CafeModel saveInfoo(CafeModel c)
	{
		return crepo.save(c);
	}
	public List<CafeModel> getInfo()
	{
		return crepo.findAll();
	}
	public CafeModel updateInfo(CafeModel iu)
	{
		return crepo.saveAndFlush(iu);
	}
	public void deleteInfo(int cafenum)
	{
		crepo.deleteById(cafenum); 
	}
}
