package com.wipro;

public class Authenticator {

	public static boolean authenticate(User user) {
		
		return user.getUsername().equals("admin") && user.getPassword().equals("admin");
	}
}
