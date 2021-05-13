package com.cg.oms.serviceimpl;

import java.util.ArrayList;
import java.util.List;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.cg.oms.entity.ProgramScheduled;
import com.cg.oms.exception.ProgramScheduledNotFoundException;
import com.cg.oms.repository.IProgramScheduledRepository;
import com.cg.oms.service.IProgramScheduledService;

@Service
public class IProgramScheduledServiceImpl implements IProgramScheduledService {
	@Qualifier("iProgramScheduledRepository")
	private IProgramScheduledRepository iProgramScheduledRepo;

	@Override
	public ProgramScheduled addProgramScheduled(ProgramScheduled programscheduled) {
		// TODO Auto-generated method stub
		if(programscheduled == null)
            throw new ProgramScheduledNotFoundException("No programscheduled Found");
        else {
            iProgramScheduledRepo.save(programscheduled);
            return programscheduled;
        }
	}

	@Override
	public ArrayList<ProgramScheduled> viewAllProgramScheduledDetails() {
		// TODO Auto-generated method stub
		 List<ProgramScheduled> allPrograms = iProgramScheduledRepo.findAll();
         if(allPrograms.isEmpty()) {
             throw new ProgramScheduledNotFoundException("No ProgramScheduled Found");
         }
         return (ArrayList<ProgramScheduled>) allPrograms;
	}
	@Override
	public ProgramScheduled updateProgramScheduledStatus(ProgramScheduled programscheduled) {
		if(programscheduled == null) {
			throw new ProgramScheduledNotFoundException("No ProgramScheduled Found");
		}else {
			iProgramScheduledRepo.save(programscheduled);
		return programscheduled;
	 }
	}

	
}
