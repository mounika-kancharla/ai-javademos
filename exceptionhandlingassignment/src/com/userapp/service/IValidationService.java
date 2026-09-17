package com.userapp.service;

import com.userapp.exceptionhandling.NameExistsException;
import com.userapp.exceptionhandling.TooLongException;
import com.userapp.exceptionhandling.TooShortException;

public interface IValidationService {
	
boolean vallidatePassword(String password)
        throws TooShortException,TooLongException;

boolean validateUsername(String username)
         throws NameExistsException;
}
