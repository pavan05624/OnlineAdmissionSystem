package com.cg.oms.serviceimpl;

import java.util.List;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.cg.oms.entity.Student;
import com.cg.oms.exception.UserNotFoundException;
import com.cg.oms.repository.IStudentRepository;
import com.cg.oms.service.IStudentService;

@Service
public class IStudentServiceImpl implements IStudentService{
    
	@Qualifier("iStudentRepository")
	private IStudentRepository iStudentRepo;
	 
	@Override
	public Student addStudentDetails(Student student) {
		// TODO Auto-generated method stub
		//logger.info("Entered addProduct()");
		if(student == null)
			throw new UserNotFoundException("No User Found");
		else {
			iStudentRepo.save(student);

			return  student;
		}
		//return iStudentRepository.save(student);
	}

	@Override
	public List<Student> getAllStudentDetails() {
		// TODO Auto-generated method stub
		List<Student> allstudents = iStudentRepo.findAll();
		if(allstudents.isEmpty()) {
			throw new UserNotFoundException("No User Found");
		}

		return allstudents;
	}

	@Override
	public Student updateStudentDetails(Student student) {
		// TODO Auto-generated method stublogger.info("Entered updatedProducts()");
		if(student == null) {
			throw new UserNotFoundException("No User Found");
		}else {
			iStudentRepo.save(student);
			return student;
		}
	}
	
	@Override
	public Student validate(String username, String password) {
		// TODO Auto-generated method stub
		Student student=iStudentRepo.findAllByUsernameAndPassword(username,password).get(0);
		if(student==null) {
			throw new UserNotFoundException("No User Found ");
		}
		return student;
	}


}

