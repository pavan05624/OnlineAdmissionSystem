package com.cg.oms.entity;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.springframework.data.relational.core.mapping.Table;

@Entity
@Table(value="Student")
public class Student extends Login
{   
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String userId;
	@JoinColumn(name="firstName")
	private String firstName;
	@JoinColumn(name="middleName")
	private String middleName;
	@JoinColumn(name="lastName")
	private String lastName;
	@JoinColumn(name="email")
	private String email;
	@JoinColumn(name="mobileNumber")
	private String mobileNumber;
	@JoinColumn(name="aadharCardNo")
	private String aadharCardNo;
	@OneToOne(cascade = CascadeType.ALL)
	private Payment payment;
	@OneToOne(cascade = CascadeType.ALL)
	private Application application;
	@OneToOne(cascade=CascadeType.ALL)
	private Document document;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student(String userId, String firstName, String middleName, String lastName, String email,
			String mobileNumber, String aadharCardNo, Payment payment) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.email = email;
		this.mobileNumber = mobileNumber;
		this.aadharCardNo = aadharCardNo;
		this.payment = payment;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getAadharCardNo() {
		return aadharCardNo;
	}

	public void setAadharCardNo(String aadharCardNo) {
		this.aadharCardNo = aadharCardNo;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}
	}
