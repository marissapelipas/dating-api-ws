package com.datingws.api.service;

import java.util.List;

import com.datingws.api.model.Customer;

public interface CustomerService {

	void save(Customer customer);
	
	List<Customer> find();
	
	Customer findById(String id);
}
