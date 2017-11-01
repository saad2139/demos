package com.revature.BankingSystem.BankClasses;

import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2231799791025255994L;
	protected int userId;
	protected String userName;
	protected String firstName;
	protected String lastName;
	protected String password;
	protected static int numberOfUsers;

	public User() {
		this.userName = "";
		this.firstName = "";
		this.lastName = "";
		this.password = hash("");

		userId = numberOfUsers;
		numberOfUsers++;
	}

	public User(String userName, String firstName, String lastName, String password) {
		super();
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = hash(password);

		userId = numberOfUsers;
		numberOfUsers++;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	private String hash(String word) {
		MessageDigest messageDigest;
		try {
			messageDigest = MessageDigest.getInstance("SHA-256");
			messageDigest.update(word.getBytes());
			word = new String(messageDigest.digest());
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return word;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", firstName=" + firstName + ", lastName="
				+ lastName + "]";
	}
}
