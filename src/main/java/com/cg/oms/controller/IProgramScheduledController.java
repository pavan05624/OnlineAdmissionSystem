package com.cg.oms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.cg.oms.entity.ProgramScheduled;
import com.cg.oms.service.IProgramScheduledService;

@RestController
public class IProgramScheduledController {
	@Autowired
  private IProgramScheduledService iProgramScheduledService;
	@PostMapping(path="/addProgramScheduled")
	public ResponseEntity <ProgramScheduled> addProgramScheduled(@RequestBody ProgramScheduled p)
	{
		ProgramScheduled obj = iProgramScheduledService.addProgramScheduled(p);
		return new ResponseEntity <ProgramScheduled> (obj,HttpStatus.OK);
		
	}
	
	@GetMapping(path="/ProgramScheduledDetails")
	public ResponseEntity<List<ProgramScheduled>> viewAllProgramScheduledDetails()
	{
		List<ProgramScheduled> list = iProgramScheduledService.viewAllProgramScheduledDetails();
		return new ResponseEntity<List<ProgramScheduled>>(list,HttpStatus.OK);
		
	}
	 @PutMapping(path="/UpdateProgramScheduled{programId}")
	    public ResponseEntity <ProgramScheduled> updateProgramScheduledStatus(@PathVariable(value = "programId") int programId,@RequestBody ProgramScheduled programscheduled){
	    	
	    	ProgramScheduled ps = iProgramScheduledService.updateProgramScheduledStatus(programscheduled);
	        return new ResponseEntity <ProgramScheduled> (ps,HttpStatus.OK);
	}


}
