package com.BankingSystem.BankingLauncher;

import com.BankingSystem.BankDataManagement.UserFile;
import com.BankingSystem.BankDataManagement.UserList;
import com.BankingSystem.BankingUI.MenuControl;

public class BankingLauncher {
	static UserList userList;

	public static void main(String[] args){
		//master admin: root
		//password : password
		userList = UserFile.loadUserList();

		MenuControl menuControl = new MenuControl(userList);
		menuControl.mainMenu();
		UserFile.saveUserList(userList);
	}

}