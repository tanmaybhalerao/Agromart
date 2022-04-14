package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.RecoveryQuestion;
import com.example.demo.services.RecoveryQuestionService;

@CrossOrigin(origins="http://localhost:3000")
@RestController
public class RecoveryQuestionController
{
	@Autowired
	RecoveryQuestionService recserv;
	
	@GetMapping("/allque")
	public List<RecoveryQuestion> getAll()
	{
		return recserv.getAll();	
	}
	
	@PostMapping("/saveque")
	public void saveRecQ(@RequestBody RecoveryQuestion rec)
	{
		RecoveryQuestion savedquestion=recserv.saveQue(rec);
		
	}
	
}
