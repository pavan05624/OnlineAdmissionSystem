/*package com.cg.oms.repository;

import java.util.ArrayList;

import com.cg.oms.entity.College;
import com.cg.oms.entity.Course;

public interface ICourseRepository
{
	public Course addCourse(Course course);
	public ArrayList<Course> viewAllCourseDetails();
	public  ArrayList<Course> getCourseDetailsByCourseName(String courceName);
	public  ArrayList<Course> getCourseDetailsByCollegeName(String collegeName);
	public  ArrayList<Course> getCourseDetailsByEligibility(String eligibility);
	public  Course getCourseDetailsByCourseId(int courceId);
	public int deleteCourseById(int courseById);
	public int deleteCourseByName(String courseName);
	public int  updateCourseDetails(Course course);
*/
package com.cg.oms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;

import com.cg.oms.entity.Course;
@Repository
@NoRepositoryBean
public interface ICourseRepository extends JpaRepository<Course, Long>{
	//public Course addCourse(Course course);
	//public ArrayList<Course> viewAllCourseDetails();
	//public Course  updateCourseDetails(Course course); //int return type changed to Course
	//public ArrayList<Course> updateAllCourseDetails();
	   
}
