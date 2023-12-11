package com.coderscampus;

public class UserService {
	User[] userInfoArray = new User[4];

	public User[] loadUsers() throws Exception {
		FileService fileService = new FileService();
		return fileService.readFile();
	}

	// creates a user and assigns it to each index of the array object, returns new
	// User
////	public User createUser(String[] userData) {
//		String username = userData[0];
//		String password = userData[1];
//		String name = userData[2];
//
//		User user = new User(username, password, name);
//		return user;
//
//	}

	// validates if userEmail & userPassword equal what the user entered
	public User getUserByUsernameAndPassword(String userEmail, String userPassword) {

		for (User user : userInfoArray) {
			// System.out.println("User in array: " + user);
			if (userEmail.equalsIgnoreCase(user.getUsername()) && userPassword.equals(user.getPassword())) {
				return user;
			}
		}
		return null;
	}
}
