package com.demo.notes.rest;

import javax.ws.rs.GET;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.notes.service.UserService;

@RestController
@RequestMapping("/login")
public class LoginWebService {

	@Autowired
	private UserService userService;

	@GET
	public Response login(@QueryParam(value = "username") String username,
			@QueryParam(value = "password") String password) {
		boolean success = userService.login(username, password);
		if (success) {
			return Response.ok().build();
		} else {
			return Response.serverError().build();
		}
	}
}
