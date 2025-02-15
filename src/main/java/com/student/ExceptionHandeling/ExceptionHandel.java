package com.student.ExceptionHandeling;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.student.CustomException.AgeException;

@RestControllerAdvice
public class ExceptionHandel {
	@ExceptionHandler(AgeException.class)
	public ResponseEntity<String> postFind(AgeException ae) {
		return new ResponseEntity<>("Please Enter a Valid Age", HttpStatus.BAD_REQUEST);
	}

}
