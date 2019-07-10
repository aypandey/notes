package com.demo.notes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.notes.entity.User;
import com.demo.notes.repo.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public User createUser(String userName, String password, String firstName, String lastName) {
		if(!userRepository.isUserNameExist(userName)) {
			User newUser = new User(userName, password, firstName, lastName);
			userRepository.save(newUser);
			
			return userRepository.findByUserName(userName);
		} else {
			return null;
		}
	}
	
	public boolean checkUser(String userName) {
		return userRepository.isUserNameExist(userName);
	}
	
	public boolean login(String username, String password) {
		User user = userRepository.findByUserName(username);
		if(user != null && password.equals(user.getPassword())) {
			return true;
		} else {
			return false;
		}
	}
}
