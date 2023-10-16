package com.masai.userService.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.userService.entities.User;
import com.masai.userService.exception.ResourceNotFoundException;
import com.masai.userService.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;
	
	// Saving user in database
	@Override
	public User saveUser(User user) {
		String userId = UUID.randomUUID().toString();
		user.setUserId(userId);
		return userRepository.save(user);
	}

	// Getting all user 
	@Override
	public List<User> getAllUser() {
		return userRepository.findAll();
	}

	// Finding user by ID
	@Override
	public User getUserByID(String ID) {
		return userRepository.findById(ID).orElseThrow(()-> new ResourceNotFoundException("User with given ID not found in server : "+ID));
	}

}
