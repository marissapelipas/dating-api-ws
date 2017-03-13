package com.datingws.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.datingws.api.model.User;
import com.datingws.api.service.ServiceException;
import com.datingws.api.service.UserService;

@RestController
public class UserController {

	@Autowired
    private UserService service;
	
//	@RequestMapping("/")
//	public String index() {
//		return "Greetings from Spring Boot!";
//	}

	@PostMapping(path = "/signup", consumes = "application/json")
	public User signup(@RequestBody User user) throws ServiceException { 
		return service.signIn(user);
	}
	
	@PostMapping(path = "/login", consumes = "application/json")
	public User login(@RequestBody User user) throws ServiceException { 
		return service.signIn(user);
	}
	
	@PostMapping(path="/authenticate")
	public void authenticate(@RequestBody String body) {
		System.out.println("Authentication here....");
	}

}
