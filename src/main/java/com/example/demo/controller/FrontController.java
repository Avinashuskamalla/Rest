package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.Login;
import com.example.demo.service.LoginService;

@RestController
@RequestMapping("/")
@CrossOrigin(origins = "http://localhost:4200")

public class FrontController {

	@Autowired
	private LoginService loginService;

	@GetMapping("/login")
	
	public String addDetails(@RequestBody Login login) {

		
		loginService.checkLoginCred(login);

		return "login";

	}
	
}
