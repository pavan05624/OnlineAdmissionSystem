package com.cg.oms.serviceimpl;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.cg.oms.entity.Application;
import com.cg.oms.exception.ApplicationNotFoundException;
import com.cg.oms.repository.IApplicationRepository;
import com.cg.oms.service.IApplicationService;


@Service
public class IApplicationServiceImpl implements IApplicationService {
	@Qualifier("iApplicationRepository")
	private IApplicationRepository iApplicationRepo;

	public Application addApplication(Application application) {
		// TODO Auto-generated method stub
		//logger.info("Entered addProduct()");
        if(application== null)
            throw new ApplicationNotFoundException("No application Found");
        else {
            iApplicationRepo.save(application);

         return application;
        }
      
	}	

	public Application getApplicationById(Integer applicationId) {
		// TODO Auto-generated method stub
		
		Application app = iApplicationRepo.findById(applicationId).get();
		if(app == null)
            throw new ApplicationNotFoundException("No application Found");
        else {
            iApplicationRepo.save(app);

         return app;
         
       

		}
	}

}