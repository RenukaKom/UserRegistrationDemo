package com.bridgelabz.userregistration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.userregistration.model.User;
import com.bridgelabz.userregistration.service.IUserService;

@RestController
public class UserRegistration {

	@Autowired
	IUserService userService;
	
	@GetMapping
	public String getHello() {
		return "Hello World";
	}
	
	@PostMapping("/user")
	public String registerUser(@RequestBody User user) {
		String response = userService.registerUser(user);
		return response;
		
	}
}
