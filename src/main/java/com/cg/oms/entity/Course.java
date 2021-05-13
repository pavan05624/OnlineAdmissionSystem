package com.cg.oms.entity;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.springframework.data.relational.core.mapping.Table;
@Entity
@Table(value="Course")
public class Course 
{   
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private int courseId;
	@Column(name="courseName")
	private String courseName;
	@Column(name="description")
	private String description;
	@Column(name="eligibility")
	private String eligibility;
	/*
	 * @OneToOne(cascade = CascadeType.ALL) private Branch branch;
	 */
	@OneToOne(cascade = CascadeType.ALL)
	private College college;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="branchId")
	private Branch branch;
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Course(int courseId, String courseName, String description, String eligibility, College college,
			Branch branch) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.description = description;
		this.eligibility = eligibility;
		this.college = college;
		this.branch = branch;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getEligibility() {
		return eligibility;
	}
	public void setEligibility(String eligibility) {
		this.eligibility = eligibility;
	}
	public College getCollege() {
		return college;
	}
	public void setCollege(College college) {
		this.college = college;
	}
	public Branch getBranch() {
		return branch;
	}
	public void setBranch(Branch branch) {
		this.branch = branch;
	}
	}
