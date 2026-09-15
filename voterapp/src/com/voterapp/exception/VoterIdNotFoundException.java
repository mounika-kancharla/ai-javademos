package com.voterapp.exception;

public class VoterIdNotFoundException extends NotEligibleException{
	
	private static final long serialVersionIUID=1L;
	
	public VoterIdNotFoundException() {
		super();
	}
	
	public VoterIdNotFoundException(String message) {
		super(message);
	}

}
