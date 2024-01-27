package com.masai.userService.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.masai.userService.entities.User;

public interface UserRepository extends MongoRepository<User, String>{

}
