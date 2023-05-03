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

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController

public class cafeController
{
	
@Autowired

public cafeService cser;
@Tag( name="Post",description="Posting details")
@PostMapping( "/postcafe ")
public cafeideas addDetails(@RequestBody cafeideas cr)
{
	return cser.saveInfoo(cr);
}

@Tag( name="Get",description="Retrieve details")
@GetMapping("/getCafe")
public List <cafeideas> getDetails()
{
	return cser.getInfo();
} 

@Tag( name="Update",description="Update details")
@PutMapping("/updateCafe")
public cafeideas updateDetails(@RequestBody cafeideas cafenum)
{
	return cser.updateInfo(cafenum);
}

@Tag( name="Delete",description="Delete details")
@DeleteMapping("/deleteCafe/{cid}")
public String deleteDetails(@PathVariable ("cid") int cafenum)
{
	cser.deleteInfo(cafenum);
	return "Cafe Number "+cafenum+" is deleted";
}

@Tag( name="Delete",description="Delete by id")
@DeleteMapping("/deleteByReq")

	public String deleteByRequestPara(@RequestParam("cid") int cafenum)
	{
		cser.deleteInfo(cafenum);
		return "Cafe number "+cafenum+" is deleted"; 
	}

@Tag( name="Sorting",description="Sorting in descending")
@GetMapping("/sortDesc/{oname}")
public List<cafeideas> sortOwner(@PathVariable("oname") String ownername)
{
	return cser.sortDesc(ownername);
}

@Tag( name="Sorting",description="Sorting in ascending")
@GetMapping("/sortAsc/{oname}")
public List<cafeideas> sortOwnerasc(@PathVariable ("oname") String ownername)
{
	return cser.sortAsc(ownername);
}

@Tag( name="Pagination",description="Larger to smaller chunks")
@GetMapping("/pagination/{pnu}/{psize}")
public List <cafeideas> paginationData(@PathVariable ("pnu") int pnu, @PathVariable("psize")int psize)
{
	return cser.paginationData(pnu, psize);
}

@GetMapping("/paginationsort/{pno}/{psize}/{pname}")
public List<cafeideas>paginationAndSorting(@PathVariable("pno")int pno,@PathVariable("psize")int psize,@PathVariable("pname")String pname)
{
	return cser.paginationAndSorting(pno,psize,pname);
	
}
@Autowired
public cafeRepo ir;

@Tag( name="Native query",description="Getting details")
@GetMapping("/saveir")
public List<cafeideas> getD()
{
	return ir.getAllData();
}

@Tag( name="Native query",description="Getting details by id")
@GetMapping("byName/{id}")
public List<cafeideas> getName(@PathVariable ("id") int pid )
{
	return ir.byCafenum(pid);
}

@Tag( name="Native query",description="Getting details by start end method")
@GetMapping("startend/{start}/{end}")
public List<cafeideas> getStart(@PathVariable ("start")int start,@PathVariable ("end")int end)
{
	return ir.startEnd(start, end);
}

@Tag( name="Native query",description="Deleting details by id and name")
@DeleteMapping("/del/{id}/{name}")
public String delD(@PathVariable ("id") int id,@PathVariable ("name")String name)
{
	ir.deleteD(id, name);
	return "deleted";
}

@Tag( name="Native query",description="Posting details")
@PutMapping("updatee/{pid}/{pname}")
public void updateQue(@PathVariable("pid")int pid,@PathVariable("pname") String pname)
{
	ir.updateByQuery(pid, pname);
}

@Tag( name="JPQL",description="Getting details by methods")
@GetMapping("jp")
public List<cafeideas> jplQuery()
{
	return ir.jpqlQ();
}

@Tag( name="JPQL",description="Getting details by id")
@GetMapping("/upp/{id}")
public List<cafeideas> jpqUp(@PathVariable ("id") int id)
{
	return ir.jqBYCon(id);
}
}





