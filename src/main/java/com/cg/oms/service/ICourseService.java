package com.cg.oms.service;
//import java.util.ArrayList;
//import com.cg.oms.entity.College;
import com.cg.oms.entity.Course;

public interface ICourseService 
{
	public Course addCourse(Course course);
	/*public ArrayList<Course> viewAllCourseDetails();
	public  ArrayList<Course> getCourseDetailsByCourseName(String courceName);
	public  ArrayList<Course> getCourseDetailsByCollegeName(String collegeName);
	public  ArrayList<Course> getCourseDetailsByEligibility(String eligibility);
	public  Course getCourseDetailsByCourseId(int courceId);
	public int deleteCourseById(int courseById);
	public int deleteCourseByName(String courseName);*/
	public Course  updateCourseDetails(Course course);
}
