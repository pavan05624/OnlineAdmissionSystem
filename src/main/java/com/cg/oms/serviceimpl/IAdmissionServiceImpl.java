package com.cg.oms.serviceimpl;

import java.util.ArrayList;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.cg.oms.entity.Admission;
import com.cg.oms.exception.AdmissionNotFoundException;
import com.cg.oms.repository.IAdmissionRepository;
import com.cg.oms.service.IAdmissionService;
@Service
public class IAdmissionServiceImpl implements IAdmissionService{

	@Qualifier("iAdmissionRepository")
	private IAdmissionRepository iAdmissionRepo;

	 @Override
	    public Admission addAdmission(Admission admission) {
	        // TODO Auto-generated method stub
	        //logger.info("Entered addProduct()");
	        if(admission == null)
	            throw new AdmissionNotFoundException("No Admission Found");
	        else {
	        	iAdmissionRepo.save(admission);
	            return admission;
	        }
	    }


 
	  public ArrayList<Admission> viewAllAdmissions() 
	  { 
		  //logger.info("Entered viewAllDocuments()");
        ArrayList<Admission> allAdmissions = (ArrayList<Admission>) iAdmissionRepo.findAll();
        if(allAdmissions.isEmpty()) {
            throw new AdmissionNotFoundException("No Admissions Found");
        }
        return (ArrayList<Admission>) allAdmissions;
	  }
    
}
