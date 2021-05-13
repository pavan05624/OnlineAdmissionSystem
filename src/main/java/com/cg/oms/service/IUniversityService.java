package com.cg.oms.service;
import com.cg.oms.entity.University;

public interface IUniversityService
{
	public University addUniversity(University university);
	//public ArrayList<University> viewAllUniversityDetails();
	//public  ArrayList<University> getUniversityDetailsByCity(String city);
	//public  ArrayList<University> getUniversityDetailsBycollegeName(String collegeName);
	//public int deleteUniversityById(int universityId);
	//public University getUniversityById(int applicationId);
	public University  updateUniversity(University university);
	//can add more funtion if require as per business logic
}
