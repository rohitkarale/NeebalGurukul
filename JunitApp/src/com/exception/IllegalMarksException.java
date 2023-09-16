package com.exception;

public class IllegalMarksException extends Exception {
	private String message;
	public IllegalMarksException(String message) {
		this.message=message;
	}
	@Override
	public String getMessage() {
		return message;
		
	}
}
