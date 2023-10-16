package com.masai.userService.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.userService.entities.User;

public interface UserRepository extends JpaRepository<User, String>{

}
