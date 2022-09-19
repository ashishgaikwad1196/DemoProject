package com.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.model.User;
import com.user.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
  UserService userService;
	
	@PostMapping("/save")
	public ResponseEntity<User> saveUser(@RequestBody User user) {
		
		User use=userService.saveUser(user);
		
		return ResponseEntity.ok().body(use);
		
	}
	
	
	

}
