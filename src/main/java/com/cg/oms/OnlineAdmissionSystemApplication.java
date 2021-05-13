package com.cg.oms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"com.cg.oms.controller", "com.cg.oms.entity", "com.cg.oms.service", "com.cg.oms.serviceimpl", "com.cg.oms.repository"})
public class OnlineAdmissionSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineAdmissionSystemApplication.class, args);
	}

}
