package com.cg.oms.serviceimpl;

import javax.transaction.Transactional;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.cg.oms.entity.Course;
import com.cg.oms.exception.CourseNotFoundException;
import com.cg.oms.repository.ICourseRepository;
import com.cg.oms.service.ICourseService;

@Service
public class ICourseServiceImpl implements ICourseService {

	@Qualifier("iCourseRepository")
	private ICourseRepository icourseRepo;

	@Override
	public Course addCourse(Course course) {
		// TODO Auto-generated method stub
	        //logger.info("Entered addCourse()");
	        if(course == null)
	            throw new CourseNotFoundException("No Course Found");
	        else {
	            icourseRepo.save(course);

	 

	            return course;
	        }
	        //return iCourseRepository.save(course);
	    
	}

	@Override
	@Transactional
	public Course updateCourseDetails(Course course) {
		// TODO Auto-generated method stub
	        //stublogger.info("Entered updatedProducts()");
	        if(course == null) {
	            throw new CourseNotFoundException("No course Found");
	        }else {
	            icourseRepo.save(course);
	            return course;
	        }
	}
}

