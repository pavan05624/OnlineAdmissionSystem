package com.cg.oms.repository;
//import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;

import com.cg.oms.entity.Application;

@Repository
@NoRepositoryBean
public interface IApplicationRepository extends JpaRepository<Application,Integer>
{
	//public Application addApplication(Application application);
	//public ArrayList<Application> viewAllApplicationDetails();
	//public  ArrayList<Application> getApplicationDetailsByEmail(String email);
	//public  ArrayList<Application> getApplicationDetailsByStatus(String status);
	//public int deleteApplicationById(int applicationId);
	//public int deleteApplicationByEmail(String email);
    //public ArrayList<Application> getApplicationById();
	//public Application getApplicationById(int applicationId);
	//public int  updateApplicationStatus(Application app);
	//can add more funtion if require as per business logic
	
}

