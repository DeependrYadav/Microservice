package com.masai.userService.service;

import java.util.List;

import com.masai.userService.entities.User;

public interface UserService {

	// Save user
	User saveUser(User user);
	
	// Get all user
	List<User> getAllUser();
	
	// Get user by ID
	User getUserByID(String ID);
}
