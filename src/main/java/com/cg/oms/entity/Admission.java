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
@Table(value="Admission")
public class Admission
{   @Column(name="emailId")
	private String emailId;
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="applicationId")
	private String applicationId;
	@Column(name="admissionStatus")
	private String admissionStatus;//Confirm after payement done;
	@OneToOne(cascade = CascadeType.ALL, mappedBy="admission")
	private College college;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="programId")
	private ProgramScheduled programscheduled;
	/*
	 * @Column(name="course") private Course course;
	 */
	private String year;
	
	public Admission() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Admission(String emailId, String applicationId, String admissionStatus, College college, ProgramScheduled programscheduled, String year) {
		super();
		this.emailId = emailId;
		this.applicationId = applicationId;
		this.admissionStatus = admissionStatus;
		this.college = college;
		this.programscheduled = programscheduled;
		this.year = year;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getApplicationId() {
		return applicationId;
	}
	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
	}
	public String getAdmissionStatus() {
		return admissionStatus;
	}
	public void setAdmissionStatus(String admissionStatus) {
		this.admissionStatus = admissionStatus;
	}
	public College getCollege() {
		return college;
	}
	public void setCollege(College college) {
		this.college = college;
	}
	public ProgramScheduled getProgramScheduled() {
		return programscheduled;
	}
	public void setProgramScheduled(ProgramScheduled programscheduled) {
		this.programscheduled = programscheduled;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	
	

}
