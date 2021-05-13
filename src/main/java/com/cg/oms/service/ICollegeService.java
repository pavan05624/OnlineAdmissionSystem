package com.cg.oms.service;
import com.cg.oms.entity.College;

public interface ICollegeService
{
	public College addCollege(College college);
	/*public ArrayList<College> viewAllCollegeDetails();
	public  ArrayList<College> getCollegeDetailsByProgram(String programName);
	public  ArrayList<College> getCollegeDetailsByCourse(String courceName);
	public  ArrayList<College> getCollegeDetailsByBranch(String branchName);
	public  ArrayList<College> getCollegeDetailsByName(String collgeName);
	public int deleteCollegeById(int collegeId);
	public int deleteCollegeByName(String collgeName);*/
	public College updateCollegeDetails(College college);
	//public  College getCollegeDetailsById(int collegeId);
}

