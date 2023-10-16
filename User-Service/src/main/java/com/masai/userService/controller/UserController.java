package com.masai.userService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.userService.entities.User;
import com.masai.userService.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService userService;
	
	// Create user
	
	@PostMapping
	public ResponseEntity<User> createUser(@RequestBody User user){
		return new ResponseEntity<User>(userService.saveUser(user),HttpStatus.CREATED);
	}
	
	// Get single User
	
	@GetMapping("/{userId}")
	public ResponseEntity<User> getSingleUser(@PathVariable String userId){
		return new ResponseEntity<User>(userService.getUserByID(userId),HttpStatus.OK);
	}
	
	// Get all users
	
	@GetMapping
	public ResponseEntity<List<User>> getAllUser(){
		return new ResponseEntity<List<User>>(userService.getAllUser(),HttpStatus.OK);
	}
	
	
}
