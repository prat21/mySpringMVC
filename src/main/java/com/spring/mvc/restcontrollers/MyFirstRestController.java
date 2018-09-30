package com.spring.mvc.restcontrollers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.spring.mvc.exception.InvalidIdException;
import com.spring.mvc.model.Student;

@RestController
public class MyFirstRestController {
	Map<Integer, Student> studentMap = new HashMap<>();
	
	public MyFirstRestController() {
		System.out.println("In MyFirstRestController cons");
		studentMap.put(1, new Student(1,"FirstStudent"));
		studentMap.put(2, new Student(2,"SecondStudent"));
	}
	
	@GetMapping("/Student/{studentId}")
	public Student getStudent(@PathVariable("studentId") int studentId) {
		if(studentId < 0)
			throw new InvalidIdException("Id must be positive integer");
		return studentMap.get(studentId);
	}
	
	
}
