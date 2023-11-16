package com.coderscampus;

import java.io.BufferedReader;
import java.io.FileReader;

public class UserService {
	BufferedReader fileReader = null;
	User[] userInfoArray = new User[4];

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
		for (User user : userInfoArray) {
			if (userEmail.equalsIgnoreCase(user.getUsername()) && userPassword.equalsIgnoreCase(user.getPassword())) {
				return user;
			}
		}
		return null;
	}
}
