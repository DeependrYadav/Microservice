package com.masai.HotelService.exception;

public class ResourceNotFoundException extends RuntimeException{

	// Exception with custom message 
	public ResourceNotFoundException(String msg) {
		super(msg);
	}

	//Exception with default message
	public ResourceNotFoundException() {
		super("Resourse not found in server !!");
	}
}
