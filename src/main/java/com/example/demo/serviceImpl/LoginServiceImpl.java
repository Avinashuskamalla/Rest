package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repo.LoginRepo;
import com.example.demo.bean.Login;
import com.example.demo.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {

	
	@Autowired
	private LoginRepo loginRepo;

	@Override
	public void checkLoginCred(Login login) {
		// TODO Auto-generated method stub

		String email = login.getEmail();
		String password = login.getPassword();

		Login login2 = loginRepo.findByEmailAndPassword(email, password);

	if (email.equalsIgnoreCase(login2.getEmail()) && password.equals(login2.getPassword())) {

			System.out.println("login successfully");

		}
	
	}

	
}
