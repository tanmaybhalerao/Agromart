package com.example.demo.repositories;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.example.demo.entities.Product;
@Transactional
@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> 
{
	@Query( value =  "select* from products where categoryid= ?1" , nativeQuery=true)
	public Product getbyID(int cid);

	//public List <Product> findById(int cid);
	
	//@Query( value =  "Delete from products where pid= ?1" , nativeQuery=true)
	//public Product deletebyid(int pdid);
}