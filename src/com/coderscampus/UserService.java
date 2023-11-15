package com.coderscampus;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserService {

	BufferedReader fileReader = null;
	Scanner scanner = new Scanner(System.in);
	List<User> users = new ArrayList<User>();

	public User[] readFile() {

		BufferedReader fileReader = null;
		String userInfo;

		try {
			fileReader = new BufferedReader(new FileReader("data.txt"));
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFound Exception.");
			e.printStackTrace();
		}

		try {
			while ((userInfo = fileReader.readLine()) != null) {
				String[] userData = userInfo.split(",");
				User user = createUser(userData);
				users.add(user);
			}
		} catch (IOException e) {
			System.out.println("IO Exception!");
			e.printStackTrace();
		} finally {
			try {
				fileReader.close();
			} catch (IOException e) {
				System.out.println("IO Exception!");
				e.printStackTrace();
			}
		}
		return users.toArray(new User[0]);
	}

	public User createUser(String[] userData) {
		if (userData != null && userData.length == 3) {
			return new User(userData[0], userData[1], userData[2]);
		}
		return null;
	}

	public User validateInput() {

		int totalInputs = 4;
		int inputCount = 0;

		while (inputCount <= totalInputs) {
			System.out.println("Enter your email:");
			String userEmail = scanner.nextLine();

			System.out.println("Enter your password:");
			String userPassword = scanner.nextLine();

			boolean loginSuccessful = false;

			for (User user : users) {
				if (userEmail.equals(user.getUsername()) && userPassword.equals(user.getPassword())) {
					System.out.println("Welcome: " + user.getName());
					loginSuccessful = true;
					break;

				}
			}

			if (!loginSuccessful || inputCount == 3) {
				System.out.println("Invalid login, please try again!");
				inputCount++;

			} 
			
			System.out.println("Too many failed login attempts, you are locked out!");
			break;
		
		}
		return null;
	}
}
