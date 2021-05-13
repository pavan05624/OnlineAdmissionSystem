/*
 * package com.cg.oms.repository;
 * 
 * import java.util.ArrayList;
 * 
 * import com.cg.oms.entity.Login; import com.cg.oms.entity.Student;
 * 
 * public interface IStudentRepository { public Student addUserDetails(Student
 * user); public Login addLoginDetails(Login login); public ArrayList<Student>
 * getAllUserDetails(); // public ArrayList<Login> getAllLoginDetails(); public
 * Student getUserDetailsById(String userId); public Login
 * getLoginDetailsById(String userId); public Login deleteUserDetailsById(String
 * userId); public Login deleteLoginDetailsById(String userId); public Login
 * changePassword(Login login ); public Login resetPassword(Login login );
 * public Student updateUserDetails(Student user); //add more function if
 * require as per requirnment
 * 
 * 
 * }
 */
package com.cg.oms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;

import com.cg.oms.entity.Student;

@Repository
@NoRepositoryBean
public interface IStudentRepository extends JpaRepository<Student, Integer>{
	
	// public Student addStudentDetails(Student student);
	   // public Login addLoginDetails(Login login);
	    //public List<Student> getAllStudentDetails();
	    
	   // public ArrayList<Login> getAllLoginDetails();
	  // public User getUserDetailsById(String userId);
	   // public Login getLoginDetailsById(String userId);
	 //   public Login deleteUserDetailsById(String userId);
	   // public Login deleteLoginDetailsById(String userId);
	   // public Login changePassword(Login login );
	   // public Login resetPassword(Login login );
	  // public Student updateStudentDetails(Student student);
	
 public List<Student> findAllByUsernameAndPassword(String Username, String password);
}


