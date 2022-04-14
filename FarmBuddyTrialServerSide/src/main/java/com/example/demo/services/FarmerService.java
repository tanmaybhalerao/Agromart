package com.example.demo.services;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.entities.Farmer;
import com.example.demo.repositories.FarmerRepository;

@Service
public class FarmerService {

	@Autowired
	FarmerRepository frepo;
	public Farmer save(Farmer f){
		return frepo.save(f);
	}
	
	 public List<Farmer> getall(){
		 return frepo.findAll();
	 }
	 public Farmer getfarmer(int fid)
	 {
		 return frepo.getById(fid);
	 }
}