package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.entities.Login;
import com.example.demo.services.LoginService;



@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class LoginController<T> 
{
	@Autowired
    LoginService lservices;
	

	@PostMapping("/logincheck")
	public T findUser(@RequestBody Login u)
	{
		String mail=u.getEmail();
		String password= u.getPassword();
		
		return(T) lservices.loginCheck(mail,password);
		
	}
	
	@PostMapping("/addlogins")
	public Login save(@RequestBody Login o)
	{
		return lservices.addlogin(o);
	}

	@GetMapping("/getalllogins")
	public List<Login> findAllUsers()
	{
		return lservices.getAllLogin();
	}
}