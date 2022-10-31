package com.employee_payroll.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee_payroll.model.User;
import com.employee_payroll.service.AuthService;

@RestController
public class AuthController {

	@Autowired
	private AuthService authService;
    
	@PostMapping("/register")
	public User Register(@RequestBody User user) {
		return authService.register(user);

	}
	
	@PostMapping("/login")
	public User login(@RequestBody User user) {
		return authService.login(user);

	}
}
