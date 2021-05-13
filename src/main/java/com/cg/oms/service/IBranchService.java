package com.cg.oms.service;
//import java.util.ArrayList;
//import com.cg.oms.entity.Application;
import com.cg.oms.entity.Branch;
//import com.cg.oms.entity.Course;

public interface IBranchService
{
	public Branch addBranch(Branch branch);
	/*public boolean addBranch( Branch branch);
	public ArrayList<Branch> viewAllBranchDetails();
	public  ArrayList<Branch> getBranchDetailsByName(String branchName);
	public int deleteBranchById(int branchId);
	public Branch getBranchById(int branchId);
	public int deleteBranchByName(String branchName);
	public int  updateBranch(Branch branch);*/
	public Branch  updateBranchDetails(Branch branch);

}

