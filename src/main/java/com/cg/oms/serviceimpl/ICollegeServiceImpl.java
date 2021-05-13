package com.cg.oms.serviceimpl;

 

import javax.transaction.Transactional;

 

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

 

import com.cg.oms.entity.College;
import com.cg.oms.exception.CollegeNotFoundException;
import com.cg.oms.repository.ICollegeRepository;
import com.cg.oms.service.ICollegeService;

 

@Service
public class ICollegeServiceImpl implements ICollegeService {

 

	@Qualifier("iCollegeRepository")
    private ICollegeRepository iCollegeRepo;

 

    @Override
    public College addCollege(College college) {
        // TODO Auto-generated method stub
            //logger.info("Entered addDocument()");
            if(college == null)
                throw new CollegeNotFoundException("No College Found");
            else {
                iCollegeRepo.save(college);
            return college;
            }
            //return iCollegeRepository.save(college);
        
    }

 
    @Override
    @Transactional
    public College updateCollegeDetails(College college) {
        // TODO Auto-generated method stub
            //stublogger.info("Entered updatedProducts()");
            if(college == null) {
                throw new CollegeNotFoundException("No College Found");
            }else {
                iCollegeRepo.save(college);
             return college;
            }
    }
}