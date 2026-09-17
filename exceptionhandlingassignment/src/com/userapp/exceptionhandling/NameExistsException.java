package com.userapp.exceptionhandling;

public class NameExistsException extends Exception {
	public NameExistsException() {
		super();
	}
		
		public NameExistsException(String message) {
			super(message);
		}
	}


