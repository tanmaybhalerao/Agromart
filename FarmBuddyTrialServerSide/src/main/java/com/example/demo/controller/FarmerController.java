package com.example.demo.controller;

import java.util.List;

import org.aspectj.weaver.ast.Instanceof;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.beans.Registration;
import com.example.demo.entities.Farmer;
import com.example.demo.entities.Login;
import com.example.demo.entities.RecoveryQuestion;
import com.example.demo.services.FarmerService;
import com.example.demo.services.LoginService;
import com.example.demo.services.RecoveryQuestionService;

@CrossOrigin(originPatterns ="http://localhost:3000")
@RestController
public class FarmerController {

	
	@Autowired
	RecoveryQuestionService rservice;
	@Autowired
	FarmerService fservice;
	@Autowired
	LoginService lservices;
	
	
	@GetMapping("/getfarmer")
	public List<Farmer>getAll()
	{
		return fservice.getall();
	}
	
	@PostMapping("/addfarmer")
	public void SaveAll(@RequestBody Registration r)
	{
		Login l= new Login(r.getEmail(),r.getPassword(),"f");
		Login record=lservices.addlogin(l);
		
		RecoveryQuestion rqs= new RecoveryQuestion(r.getRecoveryQue());
		RecoveryQuestion question =rservice.saveQue(rqs);
		
		Farmer f= new Farmer(r.getFname(),r.getLname(),r.getAddress(),r.getAdharcard(),r.getPincode(),r.getContactnumber(),r.getRecoveryAns(),question,record);
		  fservice.save(f);
	}
	
	
	@GetMapping("/getfarmerbyid")
	public Farmer getFarmer(@RequestParam int fid)
	{
		return fservice.getfarmer(fid);
	}
}