package com.voterapp.exception;
//custom exception
public class LocalityNotFoundException extends NotEligibleException {
	
	private static final long serialVersionIUID=1L;
	
	public LocalityNotFoundException() {
		super();
	}
	
	public LocalityNotFoundException(String message) {
		super(message);
	}

}
