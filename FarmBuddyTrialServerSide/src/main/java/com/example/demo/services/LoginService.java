package com.example.demo.services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entities.Customer;
import com.example.demo.entities.Farmer;
import com.example.demo.entities.Login;
import com.example.demo.repositories.CustomerRepository;
import com.example.demo.repositories.FarmerRepository;
import com.example.demo.repositories.LoginRepository;

@Service
public class LoginService 
{

	@Autowired
	LoginRepository lrepo;
	
	@Autowired
	FarmerRepository frepo;
	
	@Autowired
	CustomerRepository crepo;
	
	public Object loginCheck(String mail, String password)
	{
		Login u= lrepo.loginCheck(mail, password);
	
		if(u != null)
		{
			System.out.println("FOund");
			//Farmer of = null;
			if(u.getType().equals("f"))
			{
				//Optional <Farmer> f= frepo.findById( u.getLoginid() );
				
				Farmer f= frepo.findByid(u);
				return f;
				/*try
				{
					of=f.get();
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				return of ;*/
			}			
			else if(u.getType().equals("c"))
			{
				Customer c= crepo.findByid(u);				
				return c;
			}
			else
			{
				return u;
			}
		}
		return null;
	
	}
	
	public Login addlogin(Login u)
	{
		return lrepo.save(u);
	}
	
	public List<Login>getAllLogin()
	{
		return lrepo.findAll();
	}
}
	