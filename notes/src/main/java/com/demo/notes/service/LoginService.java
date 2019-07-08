package com.demo.notes.service;

import org.springframework.stereotype.Service;

import com.demo.notes.entity.User;
import com.demo.notes.repo.UserRepository;

@Service
public class LoginService {
	private UserRepository userRepository;
	
	public boolean createUser(String userName, String password, String firstName, String lastName) {
		if(!userRepository.isUserNameExist(userName)) {
			User newUser = new User(userName, password, firstName, lastName);
			userRepository.save(newUser);
			
			return true;
		} else {
			return false;
		}
	}
	
	public boolean checkUser(String userName) {
		return userRepository.isUserNameExist(userName);
	}
}
