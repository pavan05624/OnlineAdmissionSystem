package com.cg.oms;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cg.oms.entity.Payment;
import com.cg.oms.repository.IPaymentRepository;
import com.cg.oms.service.IPaymentService;

@SpringBootTest
public class PaymentTest extends OnlineAdmissionSystemApplicationTests {
	/*
	 * @Autowired private IPaymentRepository iPaymentRepository;
	 * 
	 * @Autowired private IPaymentService iPaymentService;
	 * 
	 * @Test void testViewAllPaymentDetails() { List<Payment> list =
	 * iPaymentRepository.findAll(); List<Payment> list1 =
	 * iPaymentService.viewAllPaymentDetails();
	 * assertThat(list.size()).isEqualTo(list1.size());
	 * 
	 * }
	 */	

}
