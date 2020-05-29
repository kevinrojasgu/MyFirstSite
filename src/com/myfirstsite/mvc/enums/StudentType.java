package com.myfirstsite.mvc.enums;

public enum StudentType {
	
	FULLTIME("Full time"), PARTIME("Part time"), NEW_STUDENT("New Student");
	
	String value; 
	
	private StudentType(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
}
