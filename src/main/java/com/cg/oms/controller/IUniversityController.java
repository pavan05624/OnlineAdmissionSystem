package com.cg.oms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 

import com.cg.oms.entity.University;
import com.cg.oms.service.IUniversityService;

@RestController
@RequestMapping("/University/api")
public class IUniversityController {	
    
	@Autowired
    private IUniversityService iUniversityService;
   
	
	@PostMapping(path="/addUniversity")
	public ResponseEntity <University> addUniversity(@RequestBody University u)
	{
		University uni = iUniversityService.addUniversity(u);
		return new ResponseEntity <University> (uni,HttpStatus.OK);
      
    }
    @PutMapping(path="/UpdateUniversity{universityId}")
    public ResponseEntity <University> updateUniversity(@PathVariable(value = "universityId") int universityId,@RequestBody University un){
    	
    	University univ= iUniversityService.updateUniversity(un);
        return new ResponseEntity <University> (univ,HttpStatus.OK);
}
}
