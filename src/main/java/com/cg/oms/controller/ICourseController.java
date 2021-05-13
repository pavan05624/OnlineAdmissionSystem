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

import com.cg.oms.entity.Course;
import com.cg.oms.service.ICourseService;
@RestController
@RequestMapping("/api/onlineadmissionsystem")
public class ICourseController {
	@Autowired
   private ICourseService iCourseService;
	
	@PostMapping(path="/addCourse")
    public ResponseEntity <Course> addCourse(@RequestBody Course c)
    {
        Course course = iCourseService.addCourse(c);
        return new ResponseEntity <Course> (course,HttpStatus.OK);
      
    }
	@PutMapping("/Course/{courseId}")
    public ResponseEntity <Course> updateCourseDetails(@PathVariable(value="courseId") int courseId,@RequestBody Course courseDetails){
        Course course = iCourseService.updateCourseDetails(courseDetails);
                return new ResponseEntity <Course> (course,HttpStatus.OK);
}
}
