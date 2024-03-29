package com.example.demo.entities;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="logins")
public class Login
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int loginid; 
	
	@Column
	String email;
	
	@Column
	String password; 
	
	@Column
	String type;
	
	
	public Login() 
	{
		super();
	}
	public Login(String email, String password, String type) 
	{
		super();
		this.email = email;
		this.password = password;
		this.type = type;
	}
	public int getLoginid() 
	{
		return loginid;
	}
	public void setLoginid(int loginid)
	{
		this.loginid = loginid;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword()
	{
		return password;
	}
	public void setPassword(String password)
	{
		this.password = password;
	}
	public String getType()
	{
		return type;
	}
	public void setType(String type)
	{
		this.type = type;
	} 
	
}
