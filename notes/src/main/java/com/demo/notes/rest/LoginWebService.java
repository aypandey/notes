package com.demo.notes.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.notes.entity.User;
import com.demo.notes.service.UserService;

@RestController
@RequestMapping("/login")
public class LoginWebService {

	@Autowired
	private UserService userService;

	@GetMapping
	public User login(@RequestParam(value = "username") String username,
			@RequestParam(value = "password") String password) {
		return userService.login(username, password);
	}
}
