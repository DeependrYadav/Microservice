package com.masai.userService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.userService.entities.User;
import com.masai.userService.exception.ResourseNotFoundException;
import com.masai.userService.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;
	
	// Saving user in database
	@Override
	public User saveUser(User user) {
		return userRepository.save(user);
	}

	// Getting all user 
	@Override
	public List<User> getAllUser() {
		return userRepository.findAll();
	}

	// Finding user by ID
	@Override
	public User getUserByID(Integer ID) {
		return userRepository.findById(ID).orElseThrow(()-> new ResourseNotFoundException("User with given ID not found in server"));
	}

}
