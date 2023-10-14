package com.masai.userService.exception;

public class ResourseNotFoundException extends RuntimeException{

	public ResourseNotFoundException(String msg) {
		super(msg);
	}

	public ResourseNotFoundException() {
		super("Resourse not found in server !!");
	}
}
