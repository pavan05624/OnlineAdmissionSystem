package com.cg.oms.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;

import com.cg.oms.entity.Admission;
@Repository
@NoRepositoryBean
public interface IAdmissionRepository extends JpaRepository<Admission, Long>{
	/*
	 * public Admission addAdmission(Admission admission); public
	 * ArrayList<Admission> viewAllAdmissions();
	 */
	

}
