package com.cg.oms.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;

import com.cg.oms.entity.Branch;
@Repository
@NoRepositoryBean
public interface IBranchRepository extends JpaRepository<Branch, Long>
{
	/*
	 * public boolean addBranch( Branch branch); public ArrayList<Branch>
	 * viewAllBranchDetails(); public ArrayList<Branch>
	 * getBranchDetailsByName(String branchName); public int deleteBranchById(int
	 * branchId); public Branch getBranchById(int branchId); public int
	 * deleteBranchByName(String branchName); public int updateBranch(Branch
	 * branch);
	 */
		//public Branch addBranch(Branch branch);
		 //public ArrayList<Branch> viewAllBranchDetails();
		//public Branch  updateBranchDetails(Branch branch); //int return type changed to branch
		 //public ArrayList<Branch> updateAllCourseDetails();
		   
	}


