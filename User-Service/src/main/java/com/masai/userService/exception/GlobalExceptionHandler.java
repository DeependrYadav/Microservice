package com.masai.userService.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;


@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<MyExceptionClass> HandleNoResourceFoundException(Exception ex,WebRequest web){
		
		MyExceptionClass description = MyExceptionClass.builder()
				.message(ex.getMessage()).timeStamp(LocalDateTime.now()).description(web.getDescription(false)).build();
		
		return new ResponseEntity<MyExceptionClass>(description,HttpStatus.NOT_FOUND);
		
	}
}
