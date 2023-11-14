package com.coderscampus;

import java.util.Scanner;

public class UserLoginApplication {

	public static void main(String[] args) {
		UserService userService = new UserService();
		Scanner scanner = new Scanner(System.in);
		
		String email;
		String password;
		String name;

		for (int i = 0; i < 5; i++) {
			if(email != userService.readFile() && password != userService.readFile()) {
				System.out.println("Enter your email:");
				String userEmail = scanner.nextLine();

				System.out.println("Enter your password:");
				String userPassword = scanner.nextLine();
			}
			
		}

		// Use scanner to prompt for username/password
		// Call method for determining match from UserService class
		// FOR loop for logic for number of times user gets to attempt login
	}

}
