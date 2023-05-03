package com.day1.review.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
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

public List <cafeideas> sortDesc (String oname)
{
	return crepo.findAll(Sort.by(oname).descending());
}

public List<cafeideas> sortAsc (String oname)
{
	return crepo.findAll(Sort.by(oname).ascending());
}
public List<cafeideas> paginationData (int pageNu,int pageSize)
{
	Page<cafeideas> p=crepo.findAll (PageRequest.of(pageNu, pageSize));
	return p.getContent();
	
}

public List<cafeideas> paginationAndSorting(int pageno,int pageSize,String pname)
{
	Page<cafeideas> p=crepo.findAll(PageRequest.of(pageno, pageSize,Sort.by(pname).descending()));
	return p.getContent();
}



}
