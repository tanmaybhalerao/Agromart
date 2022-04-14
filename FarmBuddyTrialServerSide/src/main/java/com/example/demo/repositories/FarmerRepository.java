package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Farmer;
import com.example.demo.entities.Login;

@Repository
public interface FarmerRepository extends JpaRepository<Farmer, Integer> {

	@Query("SELECT f FROM Farmer f WHERE loginid= ?1")
	public Farmer findByid(Login loginid);
}