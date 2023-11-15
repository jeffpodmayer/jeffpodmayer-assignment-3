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

	public void readFile() {

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
				User user = new User(userData[0], userData[1], userData[2]); // is this the same as the createUser method below?
				users.add(user);
				return;
			
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

  }
	
	public User createUser(String[] userData) {
		if (userData != null && userData.length >= 3) {
            String username = userData[0];
            String password = userData[1];
            String name = userData[2];
            
           return new User(username, password, name);

        } else {
            return null;
		
	 }
}
	

	public void inputCheck() {
	}
}

