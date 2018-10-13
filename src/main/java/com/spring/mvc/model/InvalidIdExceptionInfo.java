package com.spring.mvc.model;

public class InvalidIdExceptionInfo {
	private String messsage;
	private String url;
	
	public InvalidIdExceptionInfo() {
		
	}
	
	public InvalidIdExceptionInfo(String messsage, String url) {
		this.messsage = messsage;
		this.url = url;
	}

	public String getMesssage() {
		return messsage;
	}
	
	public String getUrl() {
		return url;
	}
	
	public void setMesssage(String messsage) {
		this.messsage = messsage;
	}
	
	public void setUrl(String url) {
		this.url = url;
	}
}
