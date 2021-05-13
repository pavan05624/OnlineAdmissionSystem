package com.cg.oms.serviceimpl;
import java.util.ArrayList;
import java.util.List;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.cg.oms.entity.Admin;
import com.cg.oms.entity.Course;
import com.cg.oms.entity.Document;
import com.cg.oms.entity.Payment;
import com.cg.oms.entity.ProgramScheduled;
import com.cg.oms.entity.Student;
import com.cg.oms.entity.University;
import com.cg.oms.exception.CourseNotFoundException;
import com.cg.oms.exception.DocumentNotFoundException;
import com.cg.oms.exception.PaymentNotFoundException;
import com.cg.oms.exception.ProgramScheduledNotFoundException;
import com.cg.oms.exception.UniversityNotFoundException;
import com.cg.oms.exception.UserNotFoundException;
import com.cg.oms.repository.IAdminRepository;
import com.cg.oms.repository.ICourseRepository;
import com.cg.oms.repository.IDocumentRepository;
import com.cg.oms.repository.IPaymentRepository;
import com.cg.oms.repository.IProgramScheduledRepository;
import com.cg.oms.repository.IStudentRepository;
import com.cg.oms.repository.IUniversityRepository;
import com.cg.oms.service.IAdminService;
@Service
public class IAdminServiceImpl implements IAdminService {
	@Qualifier("iAdminRepository")
 private IAdminRepository iAdminRepo;
	
 @Qualifier("iStudentRepository")
     private IStudentRepository iStudentRepo;
	 
 @Qualifier("iDocumentRepository") 
	 private IDocumentRepository iDocumentRepo;
	 
 @Qualifier("iPaymentRepository")
	 private IPaymentRepository iPaymentRepo;
	 
 @Qualifier("iUniversityRepository") 
	 private IUniversityRepository iUniversityRepo;
	 
 @Qualifier("iCourseRepository") 
	 private ICourseRepository iCourseRepo;
	  
 @Qualifier("iProgramScheduledRepository")
	 private IProgramScheduledRepository iProgramScheduledRepo;
	 
 
 
	@Override
	public List<Student> getAllStudentDetails() {
			// TODO Auto-generated method stub
			List<Student> allstudents = iStudentRepo.findAll();
			if(allstudents.isEmpty()) {
				throw new UserNotFoundException("No Student Found");
			}

			return allstudents;
	}

	@Override
	public List<Document> viewAllDocumentDetails() {
		// TODO Auto-generated method stub
		List<Document> allDocuments = iDocumentRepo.findAll();
		if(allDocuments.isEmpty()) {
			throw new DocumentNotFoundException("No Documents Found");
		}

		return allDocuments;
		//return document;
	}

	@Override
	public Document updateDocument(Document document) {
		// TODO Auto-generated method stub
		if(document == null) {
			throw new DocumentNotFoundException("No Documents Found");
		}else {
			iDocumentRepo.save(document);
			return document;
		}
	}

	@Override
	public Course addCourse(Course course) {
		// TODO Auto-generated method stub
	            //logger.info("Entered addDocument()");
	            if(course == null)
	                throw new CourseNotFoundException("No Course Found");
	            else {
	                iCourseRepo.save(course);
	                return course;
	            }
	            //return iCourseRepository.save(course);
	    }

	@Override
	public Course updateCourseDetails(Course course) {
		// TODO Auto-generated method stub
	        // TODO Auto-generated method stub
	            //stublogger.info("Entered updatedProducts()");
	            if(course == null) {
	                throw new CourseNotFoundException("No course Found");
	            }else {
	                iCourseRepo.save(course);
	                return course;
	            }
	    }

	@Override
	public University addUniversity(University university) {
	        // TODO Auto-generated method stub
	        if(university == null)
	            throw new UniversityNotFoundException("No University Found");
	        else {
	                iUniversityRepo.save(university);
	        return university;
	        }
	}

	@Override
	public University updateUniversity(University university) {
		// TODO Auto-generated method stub
	        if(university == null) {
	            throw new UniversityNotFoundException("No University Found");
	        }else {
	        	iUniversityRepo.save(university);
	        return university;
	     }
	}

	/*
	 * @Override public ProgramScheduled addProgram(ProgramScheduled program) { //
	 * TODO Auto-generated method stub return null; }
	 */

	@Override
	public ArrayList<Payment> viewAllPaymentDetails() {
	          //logger.info("Entered viewAllDocuments()");
	          List<Payment> allPayments = iPaymentRepo.findAll();
	          if(allPayments.isEmpty()) {
	              throw new PaymentNotFoundException("No Payments Found");
	          }
	          return (ArrayList<Payment>) allPayments;
	          //return document;
	}

	
	@Override
	public ProgramScheduled addProgramScheduled(ProgramScheduled programscheduled) {
		// TODO Auto-generated method stub
		if(programscheduled == null)
            throw new ProgramScheduledNotFoundException("No programscheduled Found");
        else {
            iProgramScheduledRepo.save(programscheduled);
            return programscheduled;
        }
	}
	@Override
	public Admin validate(String username, String password) {
		// TODO Auto-generated method stub
		
		Admin admin=iAdminRepo.findAllByUsernameAndPassword(username,password).get(0);
		if(admin==null) {
			throw new UserNotFoundException("No User Found ");
		}
		return admin;
	}
}

