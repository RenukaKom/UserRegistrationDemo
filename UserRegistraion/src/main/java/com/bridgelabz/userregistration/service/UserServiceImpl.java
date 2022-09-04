package com.bridgelabz.userregistration.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bridgelabz.userregistration.model.User;
import com.bridgelabz.userregistration.repository.IUserRepository;

@Service
public class UserServiceImpl implements IUserService{

	@Autowired
	IUserRepository userRepository; 
	
	@Override
	public String registerUser(User user) {
		User registeredUser = userRepository.save(user);
		return "User registered succeessfully " + registeredUser;
	}

}
