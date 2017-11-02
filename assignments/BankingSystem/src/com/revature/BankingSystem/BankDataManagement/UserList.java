package com.revature.BankingSystem.BankDataManagement;

import java.io.Serializable;
import java.util.ArrayList;

import com.revature.BankingSystem.BankClasses.*;
import com.revature.BankingSystem.BankingUI.UserInput;

public class UserList implements Serializable {
	/**
	 * Holds all the User objects; makes separating clients from admins easier.
	 */
	private static final long serialVersionUID = 838653798135373899L;
	private ArrayList<User> userList = new ArrayList<>();

	public UserList() {
		// creates default admin user
		userList = new ArrayList<>();
		addAdminUser("root", "", "", "password");
	}

	public UserList(ArrayList<User> userList) {
		this.userList = userList;
	}

	public User get(int i) {
		return userList.get(i);
	}

	public User getID(int id) {
		for (User ele : userList) {
			if (ele.getUserId() == id) {
				return ele;
			}
		}
		return null;
	}

	public User getUserName(String uName) {
		for (User ele : userList) {
			if (ele.getUserName().equals(uName)) {
				return ele;
			}
		}
		return null;
	}

	public int numberOfUsers() {
		return userList.size();
	}

	public ArrayList<ClientUser> getClientList() {
		ArrayList<ClientUser> clients = new ArrayList<>();
		for (User ele : userList) {
			if (ele.getClass() == ClientUser.class) {
				clients.add((ClientUser) ele);
			}
		}
		return clients;
	}

	public ArrayList<AdminUser> getManagerList() {
		ArrayList<AdminUser> managers = new ArrayList<>();
		for (User ele : userList) {
			if (ele.getClass() == AdminUser.class) {
				managers.add((AdminUser) ele);
			}
		}
		return managers;
	}

	public void addClientUser(String userName, String firstName, String lastName, String password) {
		userList.add(new ClientUser(userName, firstName, lastName, password));
	}

	public void addClientUser(ClientUser newClient) {
		userList.add(newClient);
	}

	public void createClient(UserInput uIn) {
		boolean uFlag = true;
		String userName = "0";
		do {

			System.out.print("Enter Username: ");
			userName = uIn.getWord();
			if (userName.equals("0")) {
				// 0 username is used by login() as a special option
				System.out.println("username cannot be 0");
			} else if (usernameValidation(userName)) {
				// can't use someone else's username
				System.out.println("username not available");
			} else {
				uFlag = false;
			}
		} while (uFlag);

		System.out.print("Enter First Name: ");
		String firstName = uIn.getWord();

		System.out.print("Enter Last Name: ");
		String lastName = uIn.getWord();

		System.out.print("Enter Password: ");
		String password = uIn.getWord();

		addClientUser(userName, firstName, lastName, password);
		System.out.println("User: " + userList.get(numberOfUsers() - 1) + " created.");
	}

	public void createAdmin(UserInput uIn) {
		boolean uFlag = true;
		String userName = "0";
		do {

			System.out.print("Enter Username: ");
			userName = uIn.getWord();
			if (userName.equals("0")) {
				// 0 username is used by login() as a special option
				System.out.println("username cannot be 0");
			} else if (usernameValidation(userName)) {
				// can't use someone elses username
				System.out.println("username not available");
			} else {
				uFlag = false;
			}
		} while (uFlag);

		System.out.print("Enter First Name: ");
		String firstName = uIn.getWord();

		System.out.print("Enter Last Name: ");
		String lastName = uIn.getWord();

		System.out.print("Enter Password: ");
		String password = uIn.getWord();

		addAdminUser(userName, firstName, lastName, password);
		System.out.println("User: " + userList.get(numberOfUsers() - 1) + " created.");
	}

	public boolean usernameValidation(String uName) {
		// checks to see if inputed string is an actual user name
		for (int i = 0; i < numberOfUsers(); i++) {
			if (userList.get(i).getUserName().equals(uName)) {
				return true;
			}
		}
		return false;
	}

	public void addAdminUser(String userName, String firstName, String lastName, String password) {
		userList.add(new AdminUser(userName, firstName, lastName, password));
	}

	public void addAdminUser(AdminUser newClient) {
		userList.add(newClient);
	}

	public void remove(User u) {
		userList.remove(u);
	}

	@Override
	public String toString() {
		String out = "UserList = [";
		for (User ele : userList) {
			out += "\n\t" + ele;
		}
		return out + "\n]";

	}

}
