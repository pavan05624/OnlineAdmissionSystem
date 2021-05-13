/*
 * package com.cg.oms.repository;
 * 
 * import java.util.ArrayList;
 * 
 * import com.cg.oms.entity.Application; import com.cg.oms.entity.College;
 * import com.cg.oms.entity.Course;
 * 
 * public interface ICollegeRepository { public College addCollege(College
 * college); public ArrayList<College> viewAllCollegeDetails(); public
 * ArrayList<College> getCollegeDetailsByProgram(String programName); public
 * ArrayList<College> getCollegeDetailsByCourse(String courceName); public
 * ArrayList<College> getCollegeDetailsByBranch(String branchName); public
 * ArrayList<College> getCollegeDetailsByName(String collgeName); public int
 * deleteCollegeById(int collegeId); public int deleteCollegeByName(String
 * collgeName); public int updateCollegeDetails(College college); public College
 * getCollegeDetailsById(int collegeId); }
 */
package com.cg.oms.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;

import com.cg.oms.entity.College;
@Repository
@NoRepositoryBean
public interface ICollegeRepository extends JpaRepository<College, Long>{

    //public College addCollege(College college);
     
    // public ArrayList<College> viewAllCollegeDetails();
     
    //public College updateCollegeDetails(College college); //int return type changed to College
   
}
