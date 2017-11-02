package com.revature.BankingSystem.BankingUI;

import com.revature.BankingSystem.BankClasses.ClientUser;
import com.revature.BankingSystem.BankClasses.AdminUser;
import com.revature.BankingSystem.BankClasses.User;
import com.revature.BankingSystem.BankDataManagement.UserList;

public class MenuControl {

	private User currentUser;
	UserList userList;

	private UserManager useMan;
	private AccountManager accMan;
	private UserLogin uLogin;
	private MainMenu mm;

	public MenuControl(UserList uList) {
		uLogin = new UserLogin();

		userList = uList;
		currentUser = uLogin.login(userList);
		if (currentUser.getClass() == ClientUser.class) {
			accMan = new AccountManager((ClientUser) currentUser);
		} else if (currentUser.getClass() == AdminUser.class) {
			useMan = new UserManager(userList, currentUser);
		}
	}

	public void mainMenu() {

		mm = new MainMenu();
		int userInput = 0;
		do {
			userInput = mm.mainMenu(currentUser);
			if (userInput != -1) {
				switch (userInput) {
				case 0:

					currentUser = uLogin.login(userList);
					if (currentUser.getClass() == ClientUser.class) {
						accMan = new AccountManager((ClientUser) currentUser);
					} else if (currentUser.getClass() == AdminUser.class) {
						useMan = new UserManager(userList, currentUser);
					}
					break;
				case 1:

					if (currentUser.getClass() == ClientUser.class) {
						if (accMan == null) {
							accMan = new AccountManager((ClientUser) currentUser);
						}
						accMan.AccounManagment();
					} else if (currentUser.getClass() == AdminUser.class) {
						if (useMan == null) {
							useMan = new UserManager(userList, currentUser);
						}
						useMan.UserManagment();
					}

					break;
				default:
					break;
				}
			}
		} while (userInput != -1);
	}

}