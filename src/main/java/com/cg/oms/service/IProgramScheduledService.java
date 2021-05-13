package com.cg.oms.service;

import java.util.ArrayList;

import com.cg.oms.entity.ProgramScheduled;

public interface IProgramScheduledService {
	public ProgramScheduled addProgramScheduled(ProgramScheduled programscheduled);
	public ArrayList<ProgramScheduled> viewAllProgramScheduledDetails();
	//public  ArrayList<Program> getApplicationDetailsByCollegeName(String collegeName);
	//public  ArrayList<Program> getProgramDetailsByName(String programName);
	//public  ArrayList<Program> getProgramDetailsByEligibility(String eligibility);
	  //public int deleteProgramScheduledById(int programId);
	//public int deleteProgramByName(String programName);
	 //public Program getProgramById(int programId);
	 public ProgramScheduled updateProgramScheduledStatus(ProgramScheduled programscheduled);
}
