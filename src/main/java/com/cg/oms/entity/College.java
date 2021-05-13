package com.cg.oms.entity;

import java.util.ArrayList;

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
@Table(value="College")
public class College
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="collegeRegId")
	private int collegeRegId;
	@Column(name="collegeName")
	private String collegeName;
	//@Column(name="collegeAddress")
	//private Address collegeAddress;
	@Column(name="programList")
	private ArrayList<ProgramScheduled> programList;
	@Column(name="courseList")
	private ArrayList<Course> courseList;
	@Column(name="branchList")
	private ArrayList<Branch> branchList;
	@OneToOne(cascade = CascadeType.ALL)
	private Admission admission;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="addressId")
	private Address address;
	@OneToOne(cascade=CascadeType.ALL, mappedBy="college")
	private Branch branch;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="universityId")
	private University university;
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "college")
	private ProgramScheduled programscheduled;
	@OneToOne(cascade=CascadeType.ALL, mappedBy="college")
	private Course course;
	@OneToOne(cascade = CascadeType.ALL)
	private Application application;
	public College() {
		super();
		// TODO Auto-generated constructor stub
	}
	public College(int collegeRegId, String collegeName, ArrayList<ProgramScheduled> programList,
			ArrayList<Course> courseList, ArrayList<Branch> branchList, Admission admission, Address address,
			Branch branch, University university) {
		super();
		this.collegeRegId = collegeRegId;
		this.collegeName = collegeName;
		this.programList = programList;
		this.courseList = courseList;
		this.branchList = branchList;
		this.admission = admission;
		this.address = address;
		this.branch = branch;
		this.university = university;
	}
	public int getCollegeRegId() {
		return collegeRegId;
	}
	public void setCollegeRegId(int collegeRegId) {
		this.collegeRegId = collegeRegId;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	
	public ArrayList<ProgramScheduled> getProgramList() {
		return programList;
	}
	public void setProgramList(ArrayList<ProgramScheduled> programList) {
		this.programList = programList;
	}
	public ArrayList<Course> getCourseList() {
		return courseList;
	}
	public void setCourseList(ArrayList<Course> courseList) {
		this.courseList = courseList;
	}
	public ArrayList<Branch> getBranchList() {
		return branchList;
	}
	public void setBranchList(ArrayList<Branch> branchList) {
		this.branchList = branchList;
	}
	public Admission getAdmission() {
		return admission;
	}
	public void setAdmission(Admission admission) {
		this.admission = admission;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Branch getBranch() {
		return branch;
	}
	public void setBranch(Branch branch) {
		this.branch = branch;
	}
	public University getUniversity() {
		return university;
	}
	public void setUniversity(University university) {
		this.university = university;
	}
	}
