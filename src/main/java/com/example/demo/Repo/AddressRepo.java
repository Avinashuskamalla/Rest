package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.bean.Address;

@Repository
public interface AddressRepo extends JpaRepository<Address,String> {
	
}
