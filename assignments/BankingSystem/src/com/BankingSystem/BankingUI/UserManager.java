package com.BankingSystem.BankingUI;

import com.BankingSystem.BankClasses.*;
import com.BankingSystem.BankDataManagement.UserList;

public class UserManager extends UIElement {
	/*
	 * UI for admins managing users and users' accounts
	 */
	private UserList userList;
	private AccountManager accMan;
	private User thisUser;

	public UserManager(UserList userList, User currentUser) {
		super();
		this.userList = userList;
		this.thisUser = currentUser;
	}

	public void UserManagment() {

		boolean userManageFlag = true;

		do {

			System.out.println(
					"\n1 - Manage a Client's account(s)" + "\n2 - Remove an User" + "\n3 - Create new Client User"
							+ "\n4 - Create new Admin User" + "\n5 - User Overview" + "\n0 - Exit User Management\n");
			int userMenu = 0;

			userMenu = getUIn().getInt(0, 5);

			switch (userMenu) {
			case 0:
				userManageFlag = false;
				break;
			case 1:
				if (userList.getClientList().size() != 0) {
					manageClient();
				} else {
					System.out.println("There are no Clients");
				}
				break;
			case 2:
				if (userList.numberOfUsers() > 1) {
					removeUser();
				} else {
					System.out.println("There are no users to remove");
				}
				break;
			case 3:
				userList.createClient(getUIn());
				break;
			case 4:
				userList.createAdmin(getUIn());
				break;
			case 5:
				overview();
				break;
			default:
				break;
			}
		} while (userManageFlag);

	}

	private void manageClient() {
		ClientUser cu = chooseClient();
		accMan = new AccountManager(cu);
		System.out.println("Managing Client: " + cu);
		accMan.AccounManagment();
	}

	private void removeUser() {
		User u = chooseUser();
		boolean balanceZero = true;
		if (u.getClass() == ClientUser.class) {
			ClientUser c = (ClientUser) u;
			if (c.getAccounts().size() > 0) {
				for (Account a : c.getAccounts()) {
					if (a.getBalance() > 0) {
						balanceZero = false;
					}
				}
			}

			if (balanceZero) {
				userList.remove(u);
			} else {
				System.out.println("cannot remove Client with non-zero balance");
			}
		} else if (u.getClass() == AdminUser.class) {
			if (u.getUserId() == thisUser.getUserId()) {
				System.out.println("cannot commit suicide");
			} else if (thisUser.getUserId() != 0) {
				System.out.println("cannot other admin user unless root");
			} else {
				userList.remove(u);
			}
		}
	}

	private void overview() {
		System.out.println(userList);
	}

	private ClientUser chooseClient() {

		System.out.println("Choose Client to manage: ");
		for (int i = 0; i < userList.getClientList().size(); i++) {
			System.out.println("" + (i + 1) + " - " + userList.getClientList().get(i));
		}

		int userMenu = getUIn().getInt(1, userList.getClientList().size()) - 1;

		return userList.getClientList().get(userMenu);
	}

	private User chooseUser() {

		System.out.println("Choose User to manage: ");
		for (int i = 0; i < userList.numberOfUsers(); i++) {
			System.out.println("" + (i + 1) + " - " + userList.get(i));
		}

		int userMenu = getUIn().getInt(1, userList.numberOfUsers()) - 1;

		return userList.get(userMenu);
	}
}