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
//	Scanner scanner = new Scanner(System.in);
	String[] users = new String[3];
	User[] userInfoArray = new User[4];
	UserService userService = new UserService();

	public User[] readFile() throws Exception {

		BufferedReader fileReader = null;
		String userInfo;

		fileReader = new BufferedReader(new FileReader("data.txt"));

		int i = 0;
		while ((userInfo = fileReader.readLine()) != null) {
			String[] userData = userInfo.split(",");
			userInfoArray[i] = createUser(userData);
			i++;

		}
		fileReader.close();
		return userInfoArray;
	}

	public User createUser(String[] userData) {
		String username = userData[0];
		String password = userData[1];
		String name = userData[2];

		User user = new User(username, password, name);
		return user;
	}

	public User validateInput(String userEmail, String userPassword) throws Exception {
		userService.readFile();
		for (User user : userInfoArray) {
			if (userEmail.equalsIgnoreCase(user.getUsername()) && userPassword.equalsIgnoreCase(user.getPassword())) {
				System.out.println("Welcome: " + user.getName());
				break;
			}
		}
		return null;
	}

}
