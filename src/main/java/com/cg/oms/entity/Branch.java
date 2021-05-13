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

@Table(value="Branch")
public class Branch 
{   
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private int branchId;
	@Column(name="branchName")
	private String branchName;
	@Column(name="branchDescription")
	private String branchDescription;
	@OneToOne(cascade = CascadeType.ALL)
	private Course course;
	@OneToOne(cascade = CascadeType.ALL)
	private College college;
	public Branch() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Branch(int branchId, String branchName, String branchDescription) {
		super();
		this.branchId = branchId;
		this.branchName = branchName;
		this.branchDescription = branchDescription;
	}
	public int getBranchId() {
		return branchId;
	}
	public void setBranchId(int branchId) {
		this.branchId = branchId;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public String getBranchDescription() {
		return branchDescription;
	}
	public void setBranchDescription(String branchDescription) {
		this.branchDescription = branchDescription;
	}
}
