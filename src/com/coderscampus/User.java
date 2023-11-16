package com.coderscampus;

public class User {

	// three properties
	private String username;
	private String password;
	private String name;

	// constructor to create a new User object for each line that is read from
	// "data.txt"
	public User(String username, String password, String name) {
		this.username = username;
		this.password = password;
		this.name = name;
	}
	// overriding toString method
//	public String toString() {
//		return "Username: " + username + " Password: " + password + " Name: " + name;
//	}

	// getters and setters related to those three properties
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
