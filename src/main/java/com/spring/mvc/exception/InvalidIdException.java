package com.spring.mvc.exception;

public class InvalidIdException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public InvalidIdException(String message) {
		super(message);
	}
	
	
}
