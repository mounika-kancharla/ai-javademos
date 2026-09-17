package com.userapp.service;

import com.userapp.exceptionhandling.NameExistsException;
import com.userapp.exceptionhandling.TooLongException;
import com.userapp.exceptionhandling.TooShortException;

public class ValidationServiceImpl implements IValidationService{

	@Override
	public boolean validateUsername(String username) throws NameExistsException {
		String[] usernames = {"Sri","Priya","Joe","Kathy"};
		for(String name : usernames) {
			if(name.equalsIgnoreCase(username)) {
				throw new NameExistsException("Name already exists");
			}
		}
		return true;
	}
	@Override
	public boolean vallidatePassword(String password) throws TooShortException, TooLongException {
		if(password.length()<6) {
			throw new TooShortException("Password should contain atleast 6 characters");
		}
		if(password.length()>15) {
			throw new TooLongException("Password should  not contain more than 15 characters");
		}
		return true;
	}
	

}
