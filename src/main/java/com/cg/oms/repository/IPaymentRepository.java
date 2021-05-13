package com.cg.oms.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;

import com.cg.oms.entity.Payment;
@Repository
@NoRepositoryBean
public interface IPaymentRepository extends JpaRepository<Payment, Integer>
{   
	//public Payment addPayment(Payment payment);
	//public ArrayList<Payment> viewAllPaymentDetails();
	/*
	 * public ArrayList<Payment> getPaymentDetailsByEmail (String emailId); public
	 * Payment getPaymentDetailsByPaymentId (int paymentId); public Payment
	 * getPaymentDetailsByApplicationId(int applicationId); public
	 * ArrayList<Payment> getPayementDetailsByStatus(String paymentStatus); public
	 * int deletePaymentById(int paymentById); public int
	 * updatePaymentDetails(Payment payemnt);
	 */
}
