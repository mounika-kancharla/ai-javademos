package com.userapp.exceptionhandling;

public class TooLongException extends Exception {
	public TooLongException() {
		super();
	}
	public TooLongException(String message) {
		super(message);
	}

}
