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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.cg.oms.entity.Student;
import com.cg.oms.service.IStudentService;
@RestController
@RequestMapping("/Student/api")
public class IStudentController {
		@Autowired
	    private IStudentService iStudentService;
	    @GetMapping(path="/Studentdetails")
	    public ResponseEntity<List<Student>> getAllStudentDetails()
	    {
	        List<Student> list = iStudentService.getAllStudentDetails();
	        return new ResponseEntity<List<Student>>(list,HttpStatus.OK);
	       
	    }
	    @PostMapping(path="/addStudent")
	    public ResponseEntity <Student> addStudentDetails(@RequestBody Student s)
	    {
	        Student stu = iStudentService.addStudentDetails(s);
	        return new ResponseEntity <Student> (stu,HttpStatus.OK);	       
         }
	    @PutMapping("/Student/{userId}")
	    public ResponseEntity <Student> updateStudentDetails(@PathVariable(value="userId") int userId,@RequestBody Student studentDetails){
	    	Student student = iStudentService.updateStudentDetails(studentDetails);
	    			return new ResponseEntity <Student> (student,HttpStatus.OK);
	    			}
	    @GetMapping(path="/Validate")
	    public ResponseEntity<Student> Validate(@RequestBody String username, String password)
	    {
	        Student valid = iStudentService.validate(username,password);
	        return new ResponseEntity<Student>(valid,HttpStatus.OK);
	       
	}
	    
}
