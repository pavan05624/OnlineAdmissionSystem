package com.cg.oms.service;
//import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
//import com.cg.oms.entity.Login;
import com.cg.oms.entity.Student;

public interface IStudentService
{
    public Student addStudentDetails(Student student);
   // public Login addLoginDetails(Login login);
    public List<Student> getAllStudentDetails();
    
   // public ArrayList<Login> getAllLoginDetails();
  // public User getUserDetailsById(String userId);
   // public Login getLoginDetailsById(String userId);
 //   public Login deleteUserDetailsById(String userId);
   // public Login deleteLoginDetailsById(String userId);
   // public Login changePassword(Login login );
   // public Login resetPassword(Login login );
   public Student updateStudentDetails(Student student);
    //add more function if require as per requirnment 
   public Student validate(String username, String password);

    
}
