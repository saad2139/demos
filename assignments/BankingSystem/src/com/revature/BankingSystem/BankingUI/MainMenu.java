package com.revature.BankingSystem.BankingUI;

import com.revature.BankingSystem.BankClasses.AdminUser;
import com.revature.BankingSystem.BankClasses.User;

public class MainMenu extends UIElement {

	public MainMenu() {
		super();
	}

	public int mainMenu(User currUser) {
		if(currUser.getClass() == AdminUser.class) {
			System.out.println("\n1 - Manage Users" + "\n0 - Log Out" + "\n-1 - Exit\n");
			return getUIn().getInt(-1, 1);
		}
		System.out.println("\n1 - Manage Accounts" + "\n0 - Log Out" + "\n-1 - Exit\n");
		return getUIn().getInt(-1, 1);
	}
}