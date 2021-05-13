package com.cg.oms.service;
import java.util.ArrayList;
import com.cg.oms.entity.Payment;

public interface IPaymentService 
{
	public Payment addPayment(Payment payment);
	public ArrayList<Payment> viewAllPaymentDetails();
	/*
	 * public ArrayList<Payment> getPaymentDetailsByEmail (String emailId); public
	 * Payment getPaymentDetailsByPaymentId (int paymentId); public Payment
	 * getPaymentDetailsByApplicationId(int applicationId); public
	 * ArrayList<Payment> getPayementDetailsByStatus(String paymentStatus); public
	 * int deletePaymentById(int paymentById); public int
	 * updatePaymentDetails(Payment payemnt);
	 */
	
}
