package com.cg.oms.serviceimpl;

import javax.transaction.Transactional;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.cg.oms.entity.Branch;
import com.cg.oms.exception.BranchNotFoundException;
import com.cg.oms.repository.IBranchRepository;
import com.cg.oms.service.IBranchService;

@Service
public class IBranchServiceImpl implements IBranchService {

	@Qualifier("iBranchRepository")
	private IBranchRepository ibranchRepo;

	@Override
	public Branch addBranch(Branch branch) {
		// TODO Auto-generated method stub
	        //logger.info("Entered addCourse()");
	        if(branch == null)
	            throw new BranchNotFoundException("No Branch Found");
	        else {
	            ibranchRepo.save(branch);

	 

	            return branch;
	        }
	        //return iCourseRepository.save(course);
	    
	}

	@Override
	@Transactional
	public Branch updateBranchDetails(Branch branch) {
		// TODO Auto-generated method stub
	        //stublogger.info("Entered updatedProducts()");
	        if(branch == null) {
	            throw new BranchNotFoundException("No branch Found");
	        }else {
	            ibranchRepo.save(branch);
	            return branch;
	        }
	}
}

