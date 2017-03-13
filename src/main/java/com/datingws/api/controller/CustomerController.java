package com.datingws.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.datingws.api.model.Customer;
import com.datingws.api.service.CustomerService;

@RestController
public class CustomerController {

    @Autowired
    private CustomerService service;
    
    
    @RequestMapping("/customers")
    public List<Customer> users(@RequestParam(value="name", defaultValue="World") String name) {
        return service.find();
    }
    
    @RequestMapping("/saveCustomer")
    public void saveCustomer() {
        service.save(new Customer("issa", "pelipas"));
    }
    
    @GetMapping("/getCustomer/{id}")
    public Customer getById(@PathVariable String id) {
    	return service.findById(id);
    }
}
