package com.spring.mvc.controlleradvice;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.spring.mvc.model.HttpMessageNotWritableExceptionInfo;

@Component
@RestControllerAdvice
public class MyFirstControllerAdvice {

	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(HttpMessageNotWritableException.class)
	public HttpMessageNotWritableExceptionInfo HttpMessageNotWritableExceptionResolver(Exception ex,HttpServletRequest req) {
		return new HttpMessageNotWritableExceptionInfo(ex.getMessage(),req.getRequestURI());
	}
}
