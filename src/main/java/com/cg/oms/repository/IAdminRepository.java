package com.cg.oms.repository;
import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;

import com.cg.oms.entity.Admin;
import com.cg.oms.entity.Course;
import com.cg.oms.entity.Document;
import com.cg.oms.entity.Payment;
import com.cg.oms.entity.ProgramScheduled;
import com.cg.oms.entity.Student;
import com.cg.oms.entity.University;

@Repository
@NoRepositoryBean
public interface IAdminRepository extends JpaRepository<Admin, Integer> {
	
	/*
	 * public List<Student> getAllStudentDetails(); public List<Document>
	 * viewAllDocumentDetails(); public Document updateDocument(Document docs);
	 * public Course addCourse(Course course); public Course
	 * updateCourseDetails(Course course); public University
	 * addUniversity(University university); public University
	 * updateUniversity(University university); public ProgramScheduled
	 * addProgramScheduled(ProgramScheduled programscheduled); public
	 * ArrayList<Payment> viewAllPaymentDetails(); //public boolean
	 * addProgramSchedule(ProgramScheduled programSchedule); public List<Admin>
	 * findAllByUsernameAndPassword(String username, String password);
	 */
	 public List<Admin> findAllByUsernameAndPassword(String username, String password);
}

