package com.example.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="recoveryquestions")
public class RecoveryQuestion
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int question_id; 
	
	@Column
	String description;
	
	
	
	public RecoveryQuestion()
	{
		super();
		
	}
	public RecoveryQuestion(String description) {
		super();
		this.description = description;
	}



	public RecoveryQuestion(int question_id, String description) {
		super();
		this.question_id = question_id;
		this.description = description;
	}

	public int getQuestion_id() {
		return question_id;
	}

	public void setQuestion_id(int question_id) {
		this.question_id = question_id;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
