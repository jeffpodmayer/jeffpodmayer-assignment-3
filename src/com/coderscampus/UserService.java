package com.coderscampus;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class UserService {

	BufferedReader fileReader = null;

	public User[] readFile() {

		List<User> users = new ArrayList<>();
		BufferedReader fileReader = null;
		
		try {
			fileReader = new BufferedReader(new FileReader("data.txt"));
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFound Exception.");
			e.printStackTrace();
		}
		String userInfo;

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
		return null;
		
		

  }
	
	public User createUser(String[] userData) {
		if (userData != null && userData.length >= 3) {
           return new User(userData[0], userData[1], userData[2]);

        } else {
            return null;
		
	 }
}
	
}

