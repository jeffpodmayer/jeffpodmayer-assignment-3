package com.coderscampus;

import java.io.BufferedReader;
import java.io.FileReader;

public class UserService {
	BufferedReader fileReader = null;
	User[] userInfoArray = new User[4];

	// reads "data.txt" file, separates it line by line, puts each line as a user in
	// userInfoArray
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

	// creates a user and assigns it to each index of the array object, returns new
	// User
	public User createUser(String[] userData) {
		String username = userData[0];
		String password = userData[1];
		String name = userData[2];

		User user = new User(username, password, name);
		return user;

	}

	// validates if userEmail & userPassword equal what the user entered
	public User validateInput(String userEmail, String userPassword) {
		for (User user : userInfoArray) {
			// System.out.println("User in array: " + user);
			if (userEmail.equalsIgnoreCase(user.getUsername()) && userPassword.equals(user.getPassword())) {
				return user;
			}
		}
		return null;
	}
}
