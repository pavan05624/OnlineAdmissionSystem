package com.cg.oms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.oms.entity.Application;
import com.cg.oms.service.IApplicationService;

@RestController
public class IApplicationController {
	@Autowired
	private IApplicationService iApplicationService; 
	
	
	@PostMapping(path="/addApplication")
    public ResponseEntity <Application> addApplication (@RequestBody Application a)
    {
        Application app = iApplicationService.addApplication(a);
        return new ResponseEntity <Application> (app,HttpStatus.OK);
       
    }
	
	@GetMapping("/Application/{applicationId}")
	 public ResponseEntity <Application> getApplicationById (@PathVariable(value="id")Integer applicationid){
	 
	 Application app = iApplicationService.getApplicationById(applicationid);
     return new ResponseEntity <Application> (app,HttpStatus.OK);
  

	
		//logger.info("Address viewAddress()");
		//return applicationService.viewApplicationById(applicationId);
   }

}
