package com.cg.oms.service;
import com.cg.oms.entity.Address;
public interface IAddresService
{
	public Address addAddress(Address address);
//	public int deleteAddressById(int addressId);
//	public int deleteAddressByCity(String city);
	public Address updateAddress(Address newAddress);
//	public Address getAddressById(int addressId);
	

}
