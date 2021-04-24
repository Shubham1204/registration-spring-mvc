package com.userRegistration.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.userRegistration.model.UserModel;
import com.userRegistration.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public int createUser(UserModel user) {
		return userRepository.saveUser(user);
	}
}
