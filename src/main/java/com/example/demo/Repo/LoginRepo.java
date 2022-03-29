package com.example.demo.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.bean.Login;

@Repository
public interface LoginRepo extends JpaRepository<Login, String> {

//	@Query(value="select * from login where email=?1 and password=?2",nativeQuery = true)
//	public  Login findByEmailAndPassword(String email,String password);
	
	@Query(value="select * from login where email=?1 and password=?2",nativeQuery = true)
	public Login findByEmailAndPassword(String email, String password);
 
}
 