package com.productapp.exception;


public class ProductNotFoundException extends Exception {
	
	private static final long serialversionUID =1L;
	
	public ProductNotFoundException() {
		
	}

    public ProductNotFoundException(String message) {
        super(message);
    }
}
