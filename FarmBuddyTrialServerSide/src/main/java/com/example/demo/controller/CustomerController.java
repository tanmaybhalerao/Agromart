package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.beans.Registration;
import com.example.demo.entities.Customer;
import com.example.demo.entities.Login;
import com.example.demo.entities.RecoveryQuestion;
import com.example.demo.services.CustomerService;
import com.example.demo.services.LoginService;
import com.example.demo.services.RecoveryQuestionService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class CustomerController 
{

	@Autowired
	RecoveryQuestionService rservice;
	@Autowired
	CustomerService cservice;
	@Autowired
	LoginService lservices;
	
	
	@GetMapping("/getcustomer")
	public List<Customer>getAll()	
	{
		return cservice.getall();
	}
	
	@PostMapping("/addcustomer")
	public void SaveAll(@RequestBody Registration r)
	{
		Login l= new Login(r.getEmail(),r.getPassword(),"c");
		Login record=lservices.addlogin(l);
		
		RecoveryQuestion rqs= new RecoveryQuestion(r.getRecoveryQue());
		RecoveryQuestion question =rservice.saveQue(rqs);
		
		Customer c= new Customer(r.getFname(),r.getLname(),r.getAddress(),r.getAdharcard(),r.getPincode(),r.getContactnumber(),r.getRecoveryAns(),question,record);
		cservice.save(c);
	}
}
