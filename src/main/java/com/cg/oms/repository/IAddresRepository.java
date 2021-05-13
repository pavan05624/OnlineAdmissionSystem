package com.cg.oms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;

//import java.util.ArrayList;

import com.cg.oms.entity.Address;
@Repository
@NoRepositoryBean
public interface IAddresRepository extends JpaRepository<Address, Integer>
{
	//public Address addAddress(Address address);
	//public int deleteAddressById(int addressId);
//	public int deleteAddressByCity(String city);
	//public Address updateAddress(Address newAddress);
	//public Address getAddressById(int addressId);
	

}
