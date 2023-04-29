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

import com.day1.review.Repository.cafeRepo;
import com.day1.review.Service.cafeService;
import com.day1.review.databaseex.cafeideas;

@RestController

public class cafeController
{
	
@Autowired

public cafeService cser;

@PostMapping( "/postcafe ")
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

@GetMapping("/sortDesc/{oname}")
public List<cafeideas> sortOwner(@PathVariable("oname") String ownername)
{
	return cser.sortDesc(ownername);
}

@GetMapping("/sortAsc/{oname}")
public List<cafeideas> sortOwnerasc(@PathVariable ("oname") String ownername)
{
	return cser.sortAsc(ownername);
}


@GetMapping("/pagination/{pnu}/{psize}")
public List <cafeideas> paginationData(@PathVariable ("pnu") int pnu, @PathVariable("psize")int psize)
{
	return cser.paginationData(pnu, psize);
}

@Autowired
public cafeRepo ir;
@GetMapping("/saveir")
public List<cafeideas> getD()
{
	return ir.getAllData();
}

@GetMapping("byName/{id}")
public List<cafeideas> getName(@PathVariable ("id") int pid )
{
	return ir.byCafenum(pid);
}

@GetMapping("startend/{start}/{end}")
public List<cafeideas> getStart(@PathVariable ("start")int start,@PathVariable ("end")int end)
{
	return ir.startEnd(start, end);
}

@DeleteMapping("/del/{id}/{name}")
public String delD(@PathVariable ("id") int id,@PathVariable ("name")String name)
{
	ir.deleteD(id, name);
	return "deleted";
}

@PutMapping("updatee/{pid}/{pname}")
public void updateQue(@PathVariable("pid")int pid,@PathVariable("pname") String pname)
{
	ir.updateByQuery(pid, pname);
}

@GetMapping("jp")
public List<cafeideas> jplQuery()
{
	return ir.jpqlQ();
}

@GetMapping("/upp")
public List<cafeideas> jpqUp(@PathVariable ("id") int id)
{
	return ir.jqBYCon(id);
}
}





