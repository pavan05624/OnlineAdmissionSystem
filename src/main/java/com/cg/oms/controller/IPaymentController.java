package com.cg.oms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.oms.entity.Payment;
import com.cg.oms.service.IPaymentService;

@RestController
public class IPaymentController { 
	@Autowired
	private IPaymentService ipaymentservice;
	@GetMapping(path="/paymentdetails")
	public ResponseEntity<List<Payment>> viewAllPaymentDetails()
	{
		List<Payment> list = ipaymentservice.viewAllPaymentDetails();
		return new ResponseEntity<List<Payment>>(list,HttpStatus.OK);
		
	}
	@PostMapping(path="/addPayment")
	public ResponseEntity <Payment> addPayment(@RequestBody Payment p)
	{
		Payment obj = ipaymentservice.addPayment(p);
		return new ResponseEntity <Payment> (obj,HttpStatus.OK);
		
	}
	
	

}
