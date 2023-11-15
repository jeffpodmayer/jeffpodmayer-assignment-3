package com.coderscampus;

import java.util.Scanner;

public class UserLoginApplication {

	public static void main(String[] args) {
		UserService userService = new UserService();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your email:");
		String userEmail = scanner.nextLine();

		System.out.println("Enter your password:");
		String userPassword = scanner.nextLine();
		
		for (int i = 0; i < 5; i++) {
			if (userEmail == username && userPassword == userService.readFile(){
				System.out.println("Welcome: " + name);
				break;
				
			} else if (userEmail != userService.readFile() && userPassword != userService.readFile()) {
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


