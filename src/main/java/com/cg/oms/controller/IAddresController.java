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

import com.cg.oms.entity.Address;
import com.cg.oms.entity.Payment;
import com.cg.oms.entity.Student;
import com.cg.oms.service.IAddresService;

@RestController
@RequestMapping("/address/api")
public class IAddresController {
	@Autowired
	private IAddresService iAddressService;
	@PostMapping(path="/addAddress")
	public ResponseEntity <Address> addAddress(@RequestBody Address a)
	{
		Address obj = iAddressService.addAddress(a);
		return new ResponseEntity <Address> (obj,HttpStatus.OK);
	}
	 @PutMapping("/Address/{addressId}")
	    public ResponseEntity <Address> updateAddress(@PathVariable(value="addressId") int addressId,@RequestBody Address address){
	    	Address obj = iAddressService.updateAddress(address);
	    			return new ResponseEntity <Address> (obj,HttpStatus.OK);
	 }
		
	}
