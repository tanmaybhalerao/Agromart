package com.example.demo.services;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entities.Category;
import com.example.demo.entities.Product;
import com.example.demo.repositories.ProductRepository;

@Service
public class ProductService
{
	@Autowired
	ProductRepository prepo;
	
	public List <Product> getall()
	{
		return prepo.findAll();
	}
	
	public Product addproduct(Product p)
	{
		return prepo.save(p);
	}
	
	public Product getproduct(int cid)
	{
		return prepo.getbyID(cid);
		
	}
	public void deleteproduct(int pdid)
	{
		 prepo.deleteById(pdid);
	}
}