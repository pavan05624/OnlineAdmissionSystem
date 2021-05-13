package com.cg.oms.service;
import java.util.ArrayList;
import java.util.List;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.oms.entity.Admin;
import com.cg.oms.entity.Course;
import com.cg.oms.entity.Document;
import com.cg.oms.entity.Payment;
import com.cg.oms.entity.ProgramScheduled;
import com.cg.oms.entity.Student;
import com.cg.oms.entity.University;

public interface IAdminService {
public List<Student> getAllStudentDetails();
public List<Document> viewAllDocumentDetails();
public Document  updateDocument(Document docs);
public Course addCourse(Course course);
public Course updateCourseDetails(Course course);
public University addUniversity(University university);
public University updateUniversity(University university);
//public ProgramScheduled addProgram(ProgramScheduled program);
public ProgramScheduled addProgramScheduled(ProgramScheduled programscheduled); 
public ArrayList<Payment> viewAllPaymentDetails();
//public boolean addProgramSchedule(ProgramScheduled programSchedule);
public Admin validate(String username, String password);
}



