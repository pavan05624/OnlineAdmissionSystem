package com.cg.oms.serviceimpl;

import java.util.ArrayList;
import java.util.List;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.cg.oms.entity.Payment;
import com.cg.oms.exception.PaymentNotFoundException;
import com.cg.oms.repository.IPaymentRepository;
import com.cg.oms.service.IPaymentService;
@Service
public class IPaymentServiceImpl implements IPaymentService {
	@Qualifier("iPaymentRepository")
	private IPaymentRepository iPaymentRepo;
	 @Override
	    public Payment addPayment(Payment payment) {
	        // TODO Auto-generated method stub
	        //logger.info("Entered addProduct()");
	        if(payment == null)
	            throw new PaymentNotFoundException("No payment Found");
	        else {
	            iPaymentRepo.save(payment);
	            return payment;
	        }
	    }

	  @Override 
	  public ArrayList<Payment> viewAllPaymentDetails() 
	  { 
		  //logger.info("Entered viewAllDocuments()");
          List<Payment> allPayments = iPaymentRepo.findAll();
          if(allPayments.isEmpty()) {
              throw new PaymentNotFoundException("No Payments Found");
          }
          return (ArrayList<Payment>) allPayments;
      }
	  /*
	 * 
	 * @Override public ArrayList<Payment> getPaymentDetailsByEmail(String emailId)
	 * { // TODO Auto-generated method stub return null; }
	 * 
	 * @Override public Payment getPaymentDetailsByPaymentId(int paymentId) { //
	 * TODO Auto-generated method stub return null; }
	 * 
	 * @Override public Payment getPaymentDetailsByApplicationId(int applicationId)
	 * { // TODO Auto-generated method stub return null; }
	 * 
	 * @Override public ArrayList<Payment> getPayementDetailsByStatus(String
	 * paymentStatus) { // TODO Auto-generated method stub return null; }
	 * 
	 * @Override public int deletePaymentById(int paymentById) { // TODO
	 * Auto-generated method stub return 0; }
	 * 
	 * @Override public int updatePaymentDetails(Payment payemnt) { // TODO
	 * Auto-generated method stub return 0; }
	 */
	

}
