package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.bean.admin.Admin;

@Repository
public interface AdminRepo  extends JpaRepository<Admin,Integer>{

}
