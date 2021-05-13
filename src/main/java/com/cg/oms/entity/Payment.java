package com.cg.oms.entity;
import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.springframework.data.relational.core.mapping.Table;
@Entity
@Table(value="Payment")
public class Payment 
{
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int paymentId;
    @Column(name="emailIdOfStudent")
	private String emailIdOfStudent;
    //@OneToOne
    //@JoinColumn(name = "applicationId")
    @OneToOne(cascade=CascadeType.ALL, mappedBy="payment")
    private Student student;
    
	private String applicationId;
    @Column(name="paymentAmount")
	private double paymentAmount;
    @Column(name="paymentDescription")
	private String paymentDescription;
    @Column(name="paymentDate")
	private LocalDate paymentDate;
    @Column(name="paymentStatus")
	private String paymentStatus;
	public Payment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Payment(int paymentId, String emailIdOfStudent, Student student, String applicationId, double paymentAmount,
			String paymentDescription, LocalDate paymentDate, String paymentStatus) {
		super();
		this.paymentId = paymentId;
		this.emailIdOfStudent = emailIdOfStudent;
		this.student = student;
		this.applicationId = applicationId;
		this.paymentAmount = paymentAmount;
		this.paymentDescription = paymentDescription;
		this.paymentDate = paymentDate;
		this.paymentStatus = paymentStatus;
	}
	public int getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}
	public String getEmailIdOfStudent() {
		return emailIdOfStudent;
	}
	public void setEmailIdOfStudent(String emailIdOfStudent) {
		this.emailIdOfStudent = emailIdOfStudent;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public String getApplicationId() {
		return applicationId;
	}
	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
	}
	public double getPaymentAmount() {
		return paymentAmount;
	}
	public void setPaymentAmount(double paymentAmount) {
		this.paymentAmount = paymentAmount;
	}
	public String getPaymentDescription() {
		return paymentDescription;
	}
	public void setPaymentDescription(String paymentDescription) {
		this.paymentDescription = paymentDescription;
	}
	public LocalDate getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(LocalDate paymentDate) {
		this.paymentDate = paymentDate;
	}
	public String getPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	}
