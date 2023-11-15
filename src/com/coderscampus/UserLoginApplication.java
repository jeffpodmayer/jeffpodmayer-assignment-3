package com.coderscampus;

import java.util.Scanner;

public class UserLoginApplication {

	public static void main(String[] args) {
		UserService userService = new UserService();
		
		Scanner scanner = new Scanner(System.in);
		
		User[] users = userService.readFile();
		
		System.out.println("Enter your email:");
		String userEmail = scanner.nextLine();

		System.out.println("Enter your password:");
		String userPassword = scanner.nextLine();
		
		for (User user : users) {
			if (userEmail.equals(user.getUsername()) && userPassword.equals(user.getPassword())){
				System.out.println("Welcome: " + user.getName());
				return;
				
			} else if (!userEmail.equals(user.getUsername()) || !userPassword.equals(user.getPassword())) {
				System.out.println("Invalid login, please try again!");
				
				System.out.println("Enter your email:");
				userEmail = scanner.nextLine();

				System.out.println("Enter your password:");
				userPassword = scanner.nextLine();
				
			}
		}
		
	}
		
		

		

		// Use scanner to prompt for username/password
		// Call method for determining match from UserService class
		// FOR loop for logic for number of times user gets to attempt login
	}


