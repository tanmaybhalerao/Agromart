package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entities.Category;
import com.example.demo.repositories.CategoryRepository;
@Service
public class CategoryService 
{
	
		@Autowired
		CategoryRepository crepo;
		
		public List<Category> all()
		{
		
			return crepo.findAll();
		}
		
		public Category save(Category ct)
		{
			return crepo.save(ct);
		}
      public Category getcat(int cid)
      {
    	  return crepo.getById(cid);
      }
	}


