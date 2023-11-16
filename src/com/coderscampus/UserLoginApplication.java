package com.coderscampus;

import java.util.Scanner;

public class UserLoginApplication {

	public static void main(String[] args) throws Exception {
		UserService userService = new UserService();
		
		Scanner scanner = new Scanner(System.in);

		int inputCount = 0;

		while (inputCount < 5) { 
			System.out.println("Enter your email:"); 
			String userEmail = scanner.nextLine();

			System.out.println("Enter your password:");
			String userPassword = scanner.nextLine();
			
			if(userService.validateInput(userEmail, userPassword) != null) {
				System.out.println("Welome: " + user.name);
			} else if (inputCount == 4) {
				System.out.println("Too many failed login attempts, you are locked out!");
				break;
			} else {
				System.out.println("Invalid login, please try again!");
				inputCount++;
			}
		}
	}
}
		
		
		
		
			


			

		
// locked out statement right after loop
