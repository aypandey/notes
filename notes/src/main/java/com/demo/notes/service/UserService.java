package com.demo.notes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.notes.entity.User;
import com.demo.notes.repo.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public List<User> createUser(String userName, String password, String firstName, String lastName) {
		if(userRepository.findByUserName(userName) != null) {
			return null;
		} else {
			User newUser = new User(userName, password, firstName, lastName);
			userRepository.save(newUser);
			
			return userRepository.findAll();
		}
	}
	
	public boolean checkUser(String userName) {
		return (userRepository.isUserNameExist(userName) == 1) ? true : false;
	}
	
	public User login(String username, String password) {
		User user = userRepository.findByUserName(username);
		if(user != null && password != null && password.equals(user.getPassword())) {
			return user;
		} else {
			return null;
		}
	}
}
