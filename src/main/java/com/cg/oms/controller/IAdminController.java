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

import com.cg.oms.entity.Admin;
import com.cg.oms.entity.Course;
import com.cg.oms.entity.Document;
import com.cg.oms.entity.Payment;
import com.cg.oms.entity.Student;
import com.cg.oms.entity.University;
import com.cg.oms.service.IAdminService;
import com.cg.oms.service.ICourseService;
import com.cg.oms.service.IDocumentService;
import com.cg.oms.service.IPaymentService;
import com.cg.oms.service.IStudentService;
import com.cg.oms.service.IUniversityService;

@RestController
@RequestMapping("/Admin/api")
public class IAdminController {
	@Autowired 
	private IAdminService iAdminService;
	
	 @Autowired private IStudentService iStudentService;
	 
	 @Autowired private IDocumentService iDocumentService;
	 
	 @Autowired private IPaymentService iPaymentService;
	 
	 @Autowired private IUniversityService iUniversityService;
	 
	 @Autowired private ICourseService iCourseService;
	 
	
	
	
    @GetMapping(path="/Studentdetails")
    public ResponseEntity<List<Student>> getAllStudentDetails()
    {
        List<Student> list = iStudentService.getAllStudentDetails();
        return new ResponseEntity<List<Student>>(list,HttpStatus.OK);
        
}
    @GetMapping(path="/Documentdetails")
    public ResponseEntity<List<Document>> viewAllDocumentDetails()
    {
        List<Document> list = iDocumentService.viewAllDocumentDetails();
        return new ResponseEntity<List<Document>>(list,HttpStatus.OK);
       
    }
    @PostMapping(path="/addDocument")
    public ResponseEntity <Document> addDocument(@RequestBody Document d)
    {
        Document doc = iDocumentService.addDocument(d);
        return new ResponseEntity <Document> (doc,HttpStatus.OK);
       
    }
    @GetMapping(path="/PaymentDetails")
    public ResponseEntity<List<Payment>> viewAllPaymentDetails()
    {
        List<Payment> list = iPaymentService.viewAllPaymentDetails();
        return new ResponseEntity<List<Payment>>(list,HttpStatus.OK);
       
    }
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
    @PostMapping(path="/addCourse")
    public ResponseEntity <Course> addDocument(@RequestBody Course c)
    {
        Course course = iCourseService.addCourse(c);
        return new ResponseEntity <Course> (course,HttpStatus.OK);
     
    }
    @PutMapping("/Course/{courseId}")
    public ResponseEntity <Course> updateCourseDetails(@PathVariable(value="courseId") int courseId,@RequestBody Course courseDetails){
        Course course = iCourseService.updateCourseDetails(courseDetails);
                return new ResponseEntity <Course> (course,HttpStatus.OK);
}
    @GetMapping(path="/Validate")
    public ResponseEntity<Admin> Validate(@RequestBody String username, String password)
    {
        Admin val = iAdminService.validate(username,password);
        return new ResponseEntity<Admin>(val,HttpStatus.OK);
       
}
    
    
}

