package com.cg.oms.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.oms.entity.Admission;
import com.cg.oms.entity.Payment;
import com.cg.oms.service.IAdmissionService;

@RestController
@RequestMapping("/Admission/api")
public class IAdmissionController {
	@Autowired
	private IAdmissionService iAdmissionService;
	
	@GetMapping(path="/AdmissionDetails")
	public ResponseEntity<ArrayList<Admission>> viewAllAdmissions()
	{
		ArrayList<Admission> list = iAdmissionService.viewAllAdmissions();
		return new ResponseEntity<ArrayList<Admission>>(list,HttpStatus.OK);
		
	}
	@PostMapping(path="/addAdmission")
	public ResponseEntity <Admission> addAdmission(@RequestBody Admission a)
	{
		Admission obj = iAdmissionService.addAdmission(a);
		return new ResponseEntity <Admission> (obj,HttpStatus.OK);
		
	}

	

}
