package com.demo.notes.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.notes.entity.User;
import com.demo.notes.model.UserDTO;
import com.demo.notes.service.UserService;

@RestController
@RequestMapping("/createuser")
public class CreateUserWebService {
	
	@Autowired
	private UserService userService;
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response createUser(UserDTO user) {
		User newUser = userService.createUser(user.getUsername(), user.getPassword(), user.getFirstName(), user.getLastName());
		
		if(newUser != null) {
			return Response.ok(newUser).build();
		} else {
			return Response.serverError().build();
		}
	}
}
