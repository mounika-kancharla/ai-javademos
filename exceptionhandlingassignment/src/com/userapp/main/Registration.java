package com.userapp.main;

import java.util.Scanner;

import com.userapp.exceptionhandling.NameExistsException;
import com.userapp.exceptionhandling.TooLongException;
import com.userapp.exceptionhandling.TooShortException;
import com.userapp.service.IValidationService;
import com.userapp.service.ValidationServiceImpl;

public class Registration {

public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		IValidationService service =new ValidationServiceImpl();
		
		System.out.println("Enter username:");
		String username = sc.nextLine();
		try {
			//validate username
			service.validateUsername(username);
			//if username is available,ask for password
			System.out.println("Enter password: ");
			String password = sc.nextLine();
			//validate password 
			service.vallidatePassword(password);
			System.out.println("Welcome "+username+ ".You are registered");
		}catch (NameExistsException e) {
			System.out.println(e.getMessage());
		}catch (TooShortException e) {
			System.out.println(e.getMessage()); 
		}catch (TooLongException e) {
			System.out.println(e.getMessage());
		}finally {
			sc.close();
		}
	}

}
