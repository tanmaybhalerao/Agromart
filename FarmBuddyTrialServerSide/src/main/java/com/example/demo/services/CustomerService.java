package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.beans.Registration;
import com.example.demo.entities.Customer;
import com.example.demo.repositories.CustomerRepository;

@Service
public class CustomerService 
{
	@Autowired
	CustomerRepository crepo;
	public Customer save(Customer c){
		return crepo.save(c);
	}
	
	 public List<Customer> getall(){
		 return crepo.findAll();
	 }
	
}
