package com.spring.mvc.model;

public class Student {
	private String name;
	private int id;
	
	public Student() {
		
	}
	
	public Student(int id,String name) {
		this.name = name;
		this.id = id;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
}
