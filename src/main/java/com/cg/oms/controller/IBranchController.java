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

import com.cg.oms.entity.Branch;
import com.cg.oms.service.IBranchService;

@RestController
@RequestMapping("/api/onlineadmissionsystem")
public class IBranchController {
	@Autowired
   private IBranchService iBranchService;
	
	@PostMapping(path="/addBranch")
    public ResponseEntity <Branch> addBranch(@RequestBody Branch b)
    {
       
		Branch branch = iBranchService.addBranch(b);
        return new ResponseEntity <Branch> (branch,HttpStatus.OK);
      
    }
	
	@PutMapping("/Branch/{branchId}")
    public ResponseEntity <Branch> updateBranchDetails(@PathVariable(value="branchId") int branchId,@RequestBody Branch branchDetails){
        Branch branch = iBranchService.updateBranchDetails(branchDetails);
                return new ResponseEntity <Branch> (branch,HttpStatus.OK);
}
}




