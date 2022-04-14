package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.RecoveryQuestion;
import com.example.demo.repositories.RecoveryQuestionRepository;
import java.util.List;

@Service
public class RecoveryQuestionService
{
	@Autowired
	RecoveryQuestionRepository recrepo;
	
	public List<RecoveryQuestion> getAll()
	{
	
		return recrepo.findAll();
	}
	
	public RecoveryQuestion saveQue(RecoveryQuestion que)
	{
		return recrepo.save(que);
	}

}
