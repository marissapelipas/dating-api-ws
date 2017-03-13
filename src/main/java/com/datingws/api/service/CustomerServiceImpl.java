package com.datingws.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.datingws.api.model.Customer;
import com.datingws.api.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository repository;
	
	@Override
	public void save(Customer customer) {
		repository.save(customer);
		
	}

	@Override
	public List<Customer> find() {
		return repository.findAll();
	}

	@Override
	public Customer findById(String id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

}
