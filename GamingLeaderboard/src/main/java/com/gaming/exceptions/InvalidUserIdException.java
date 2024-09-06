package com.gaming.exceptions;

public class InvalidUserIdException extends Exception {
	
	private String msg;
	
	public InvalidUserIdException(String msg) {
		this.msg=msg;
	}

}
