package com.coderscampus;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class UserService {

	BufferedReader fileReader = null;

	public void readFile() throws FileNotFoundException {
		
		List <String[]> users = new ArrayList<String[]>();
		
		
			BufferedReader fileReader = new BufferedReader(new FileReader("data.txt"));
			String userInfo;
			
			try {
				while ((userInfo = fileReader.readLine()) != null) {
					String[] user = { userInfo };
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
		
		  for(String[] userArray : users) {
			  String userLine = userArray[0];
			  
			  String[] userData = userLine.split(",");
			  
			  String username = userData[0];
			  String password = userData[1];
			  String name = userData[2];
			  
			  User user = new User();
			  user.setUsername(username);
			  user.setPassword(password);
			  user.setName(name);
		  }
		}
		
	public User createUser(String[] userInfo) {
		 
	}
		

}

 
// read data from file and create User array
// validate of inputed username and password matches what is in User Array
