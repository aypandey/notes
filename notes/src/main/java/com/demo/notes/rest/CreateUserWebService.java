package com.demo.notes.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.notes.entity.User;
import com.demo.notes.model.UserDTO;
import com.demo.notes.service.UserService;

@RestController
@RequestMapping(value="/createuser")
public class CreateUserWebService {
	
	@Autowired
	private UserService userService;
	
	@Consumes(MediaType.APPLICATION_JSON)
	@PostMapping
	public boolean createUser(@RequestBody UserDTO user) {
		List<User> newUsers = userService.createUser(user.getUsername(), user.getPassword(), user.getFirstName(), user.getLastName());
		
		if(newUsers != null) {
			return true;
		} else {
			return false;
		}
	}
}
