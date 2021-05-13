package com.cg.oms.serviceimpl;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.cg.oms.entity.University;
import com.cg.oms.exception.UniversityNotFoundException;
import com.cg.oms.repository.IUniversityRepository;
import com.cg.oms.service.IUniversityService;

@Service
public class IUniversityServiceImpl implements IUniversityService{
	
	@Qualifier("iUniversityRepository")
	private IUniversityRepository iUniversityRepo;

	public University addUniversity(University university) {
		// TODO Auto-generated method stub
		if(university == null)
			throw new UniversityNotFoundException("No University Found");
		else {
				iUniversityRepo.save(university);
		return university;
		}
	}


	public University updateUniversity(University university) {
		// TODO Auto-generated method stub
		if(university == null) {
			throw new UniversityNotFoundException("No University Found");
		}else {
			iUniversityRepo.save(university);
		return university;
	 }
	}

}
