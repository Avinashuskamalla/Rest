package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.bean.OrderSummary;

@Repository
public interface OrderSummerRepo  extends JpaRepository<OrderSummary,Integer>{

}
