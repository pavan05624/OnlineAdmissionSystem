package com.cg.oms.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.springframework.data.relational.core.mapping.Table;
@Entity
@Table(value = "University")
public class University 
{
	private String name;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int universityId;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="addressId")
	private Address address;
	@OneToMany(cascade = CascadeType.ALL, mappedBy="university")
	private List<College> collgeList;
	
	public University() {
		super();
		// TODO Auto-generated constructor stub
	}
	public University(String name, int universityId, Address address, ArrayList<College> collgeList) {
		super();
		this.name = name;
		this.universityId = universityId;
		this.address = address;
		this.collgeList = collgeList;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getUniversityId() {
		return universityId;
	}
	public void setUniversityId(int universityId) {
		this.universityId = universityId;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public List<College> getCollgeList() {
		return collgeList;
	}
	public void setCollgeList(List<College> collgeList) {
		this.collgeList = collgeList;
	}
	
}
