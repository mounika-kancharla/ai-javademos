package com.voterapp.exception;

public class UnderAgeException extends NotEligibleException {

	private static final long serialVersionIUID=1L;
	
	public UnderAgeException() {
		super();
	}
	
	public UnderAgeException(String message) {
		super(message);
	}
}
