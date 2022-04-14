package com.example.demo.repositories;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.example.demo.entities.Login;

@Repository
public interface LoginRepository extends JpaRepository<Login, Integer>{

	@Query("SELECT l FROM Login l WHERE email= :mail AND password= :password")
	public Login loginCheck(String mail, String password);
}
