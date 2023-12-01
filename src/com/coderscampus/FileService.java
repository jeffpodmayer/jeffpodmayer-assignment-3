package com.coderscampus;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileService {
	
	// reads "data.txt" file, separates it line by line, puts each line as a user in
	// userInfoArray
	
	public User[] readFile() throws Exception {
		User[] userInfoArray = new User[4];
		BufferedReader fileReader = null;
		String userInfo;

		fileReader = new BufferedReader(new FileReader("data.txt"));

		int i = 0;

		while ((userInfo = fileReader.readLine()) != null) {
			String[] userData = userInfo.split(",");
			userInfoArray[i] = new User(userData[0],userData[1],userData[2]);
			i++;
		}
		fileReader.close();
		return userInfoArray;

	}

}
