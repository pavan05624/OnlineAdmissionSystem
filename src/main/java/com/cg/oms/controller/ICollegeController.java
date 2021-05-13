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

import com.cg.oms.entity.College;
import com.cg.oms.service.ICollegeService;
//import com.cg.oms.serviceimpl.CollegeServiceImpl;

@RestController
@RequestMapping("/api/onlineadmissionsystem")

public class ICollegeController {
  @Autowired
   private ICollegeService iCollegeService;
   @PostMapping(path="/addCollege")
    public ResponseEntity <College> addCollege(@RequestBody College college)
    {
	   College col = iCollegeService.addCollege(college);
        return new ResponseEntity <College> (col,HttpStatus.OK);
      
    }
   /* @PutMapping("/College/{collegeRegId}")
    public ResponseEntity <College> updateCollegeDetails(@PathVariable(value="collegeRegId") int collegeRegId,@RequestBody College collegeDetails){
    	College college = icollegeService.updateCollegeDetails(collegeDetails);
                return new ResponseEntity <College> (college,HttpStatus.OK);
    }  */              
                @PutMapping(path="/UpdateCollegeDetails{collegeRegId}")
                public ResponseEntity <College> updateCollegeDetails(@PathVariable(value = "collegeRegId") int collegeRegId,@RequestBody College c){
                   
                   College obj= iCollegeService.updateCollegeDetails(c);
                    return new ResponseEntity <College> (obj,HttpStatus.OK);
            }

}