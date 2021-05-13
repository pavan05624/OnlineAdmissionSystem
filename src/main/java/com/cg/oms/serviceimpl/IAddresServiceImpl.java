package com.cg.oms.serviceimpl;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.cg.oms.entity.Address;
import com.cg.oms.exception.AddressNotFoundException;
import com.cg.oms.repository.IAddresRepository;
import com.cg.oms.service.IAddresService;

@Service
public class IAddresServiceImpl implements IAddresService {
	@Qualifier("iAddresRepository")
	private IAddresRepository iAddresRepo;
	
	 @Override
	    public Address addAddress(Address address) {
	        // TODO Auto-generated method stub
	        //logger.info("Entered addProduct()");
	        if(address == null)
	            throw new AddressNotFoundException("No Address Found");
	        else {
	        	iAddresRepo.save(address);
	            return address;
	        }
	    }

	@Override
	public Address updateAddress(Address address) {
		// TODO Auto-generated method stublogger.info("Entered updatedProducts()");
		if(address == null) {
			throw new AddressNotFoundException("No Address Found");
		}else {
			iAddresRepo.save(address);
			return address;
		}
	}
	

}
