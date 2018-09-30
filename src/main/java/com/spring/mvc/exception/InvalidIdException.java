package com.spring.mvc.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_ACCEPTABLE, reason="Negative Id")
public class InvalidIdException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public InvalidIdException(String message) {
		super(message);
	}
	
	
}
