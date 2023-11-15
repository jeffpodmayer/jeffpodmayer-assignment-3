package com.coderscampus;

import java.util.Scanner;

public class UserLoginApplication {

	public static void main(String[] args) {
		UserService userService = new UserService();

		Scanner scanner = new Scanner(System.in);

		User[] users = userService.readFile();
		
		int totalInputs = 4;
		int inputCount = 0;

		while (inputCount < totalInputs) {
			System.out.println("Enter your email:");
			String userEmail = scanner.nextLine();

			System.out.println("Enter your password:");
			String userPassword = scanner.nextLine();


			for (User user : users) { // program not recognizing correct input of userEmail/userPassword
				if (userEmail.equals(user.getUsername()) && userPassword.equals(user.getPassword())) { // is this correct way to check for match?
					System.out.println("Welcome: " + user.getName());
					break;

				} else if(!userEmail.equals(user.getUsername()) || !userPassword.equals(user.getPassword())) { 
					System.out.println("Invalid login, please try again!");
					inputCount++;
					
					System.out.println("Enter your email:");
					userEmail = scanner.nextLine();

					System.out.println("Enter your password:");
					userPassword = scanner.nextLine();
					
						}
					
					}
						System.out.println("Too many failed login attempts, you are locked out!");
				}

			}
			
		}
		

