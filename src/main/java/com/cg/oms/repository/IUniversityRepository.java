package com.cg.oms.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;

import com.cg.oms.entity.University;
@Repository
@NoRepositoryBean
public interface IUniversityRepository extends JpaRepository<University, Integer>
{
	//public University addUniversity(University university);
//	public ArrayList<University> viewAllUniversityDetails();
//	public  ArrayList<University> getUniversityDetailsByCity(String city);
//	public  ArrayList<University> getUniversityDetailsBycollegeName
//	(String collegeName);
//	public int deleteUniversityById(int universityId);
//	public University getUniversityById(int applicationId);
	//public University  updateUniversity(University university);
	//can add more funtion if require as per business logic
}


