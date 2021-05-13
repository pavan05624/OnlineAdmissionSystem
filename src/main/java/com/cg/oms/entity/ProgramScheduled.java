package com.cg.oms.entity;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.springframework.data.relational.core.mapping.Table;

@Entity
@Table(value="ProgramScheduled")
public class ProgramScheduled
{   @Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer programId;	
	private String programName;
	
	private String programDescription;
	
	private String programEligibility;
	
	private String programDuration;
	
	private String degreeOffered;
	
	private LocalDate startDate;
	private LocalDate endDate;
	
	@OneToOne(cascade = CascadeType.ALL)
	private College college;
	public ProgramScheduled() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProgramScheduled(Integer programId, String programName, String programDescription, String programEligibility,
			String programDuration, String degreeOffered, LocalDate startDate, LocalDate endDate, College college) {
		super();
		this.programId = programId;
		this.programName = programName;
		this.programDescription = programDescription;
		this.programEligibility = programEligibility;
		this.programDuration = programDuration;
		this.degreeOffered = degreeOffered;
		this.startDate = startDate;
		this.endDate = endDate;
		this.college = college;
	}
	public Integer getProgramId() {
		return programId;
	}
	public void setProgramId(Integer programId) {
		this.programId = programId;
	}
	public String getProgramName() {
		return programName;
	}
	public void setProgramName(String programName) {
		this.programName = programName;
	}
	public String getProgramDescription() {
		return programDescription;
	}
	public void setProgramDescription(String programDescription) {
		this.programDescription = programDescription;
	}
	public String getProgramEligibility() {
		return programEligibility;
	}
	public void setProgramEligibility(String programEligibility) {
		this.programEligibility = programEligibility;
	}
	public String getProgramDuration() {
		return programDuration;
	}
	public void setProgramDuration(String programDuration) {
		this.programDuration = programDuration;
	}
	public String getDegreeOffered() {
		return degreeOffered;
	}
	public void setDegreeOffered(String degreeOffered) {
		this.degreeOffered = degreeOffered;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public LocalDate getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	public College getCollege() {
		return college;
	}
	public void setCollege(College college) {
		this.college = college;
	}
	
}