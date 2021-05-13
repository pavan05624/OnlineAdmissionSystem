package com.cg.oms.service;

import java.util.ArrayList;

import com.cg.oms.entity.Admission;

public interface IAdmissionService {
    public Admission addAdmission(Admission admission);
	public ArrayList<Admission> viewAllAdmissions();


}
