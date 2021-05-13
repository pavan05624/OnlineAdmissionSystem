package com.cg.oms.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;

import com.cg.oms.entity.ProgramScheduled;
@Repository
@NoRepositoryBean
public interface IProgramScheduledRepository extends JpaRepository<ProgramScheduled, Integer>
{
	//public ProgramScheduled addProgramScheduled(ProgramScheduled programscheduled);
	//public ArrayList<ProgramScheduled> viewAllProgramScheduledDetails();
	//public  ArrayList<Program> getApplicationDetailsByCollegeName(String collegeName);
	//public  ArrayList<Program> getProgramDetailsByName(String programName);
	//public  ArrayList<Program> getProgramDetailsByEligibility(String eligibility);
	  //public int deleteProgramScheduledById(int programId);
	//public int deleteProgramByName(String programName);
	 //public Program getProgramById(int programId);
	 //public ProgramScheduled updateProgramScheduledStatus(ProgramScheduled programscheduled);
}
