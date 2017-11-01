package com.revature.BankingSystem.BankingUI;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import com.revature.BankingSystem.BankClasses.User;
import com.revature.BankingSystem.BankDataManagement.UserList;

public class UserLogin extends UIElement {

	private UserList userList;
	private User userEntering;

	public UserLogin() {
		super();
	}

	public User login(UserList uList) {

		userList = uList;

		boolean cancel;
		do {
			cancel = false;
			boolean displayFlag = true;
			String uName = null;
			do {
				System.out.print("Enter Username (Enter 0 to create new user): ");
				uName = getUIn().getString();
				if (usernameValidation(uName)) {
					displayFlag = false;
				} else if (uName.equals("0")) {
					newUser();
				} else {
					System.out.print("Invalid Username\n");
				}
			} while (displayFlag);

			displayFlag = true;
			String uPassword = null;
			do {
				System.out.print("Enter 0 to cancel login\nEnter Password: ");
				uPassword = getUIn().getString();
				if (uPassword.equals("0")) {
					displayFlag = false;
					cancel = true;
				} else if (passwordValidation(uPassword)) {
					displayFlag = false;
				} else {
					System.out.print("Invalid Username/Password Combonation\n");
				}
			} while (displayFlag);
		} while (cancel);

		return userEntering;

	}

	public boolean usernameValidation(String uName) {
		for (int i = 0; i < userList.numberOfUsers(); i++) {
			if (userList.get(i).getUserName().equals(uName)) {
				userEntering = userList.get(i);
				return true;
			}
		}
		return false;
	}

	public boolean passwordValidation(String uPassword) {

		MessageDigest messageDigest;
		try {
			messageDigest = MessageDigest.getInstance("SHA-256");
			messageDigest.update(uPassword.getBytes());
			uPassword = new String(messageDigest.digest());
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return userEntering.getPassword().equals(uPassword);
	}

	public void newUser() {

		boolean uFlag = true;
		String userName = "0";
		do {
			System.out.print("Enter Username: ");
			userName = getUIn().getString();
			if (userName.equals("0")) {
				System.out.println("username cannot be 0");
			} else if (usernameValidation(userName)) {
				System.out.println("username not available");
			} else {
				uFlag = false;
			}
		} while (uFlag);
		System.out.print("Enter First Name: ");
		String firstName = getUIn().getString();
		System.out.print("Enter Last Name: ");
		String lastName = getUIn().getString();
		System.out.print("Enter Password: ");
		String password = getUIn().getString();

		userList.addClientUser(userName, firstName, lastName, password);
		System.out.println("User: " + userList.get(userList.numberOfUsers() - 1) + " created.");
	}

}
