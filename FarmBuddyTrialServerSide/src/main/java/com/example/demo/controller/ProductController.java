package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entities.Category;
import com.example.demo.entities.Farmer;
import com.example.demo.entities.Product;
import com.example.demo.entities.ProductAdd;
import com.example.demo.services.CategoryService;
import com.example.demo.services.FarmerService;
import com.example.demo.services.ProductService;
@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class ProductController 
{
    @Autowired
	ProductService pservices;
    @Autowired
    CategoryService cservices;
    @Autowired
    FarmerService fservices;
    
    @GetMapping("/getallp")
    public List <Product> getall()
    {
    	return pservices.getall();
    }
    
    @PostMapping("/addproduct")
	public Product save(@RequestBody ProductAdd p)
	{
    	
      /* Category c = new Category(c.getCategoryid());
    	Category cat = cservices.save(c);
    	
    	Farmer Feq = new Farmer (Feq.getFarmer_id());
    	Farmer fm = fservices.save(Feq);*/
    	//System.out.println(p.getFarmerid());
    	Category c = cservices.getcat(p.getCategoryid());
    	Farmer f = fservices.getfarmer(p.getFarmerid());
    	
    	
		Product pro=new Product(p.getPname(),p.getQuantity(),p.getPrice(),p.getDescription(),p.getProductimage(),c,f);
		return pservices.addproduct(pro);
	
	}
    
    @GetMapping("/getproductbyid")
    public Product getproductbyid(@RequestParam("cid") int cid)
    {
 	   return pservices.getproduct(cid);
    }
    
    @DeleteMapping("/delete")
    public void deleteproduct(@RequestParam("pdid") int pdid)
    {
 	   pservices.deleteproduct (pdid);
    }
}