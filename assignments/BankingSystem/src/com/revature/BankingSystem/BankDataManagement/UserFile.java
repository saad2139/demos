package com.revature.BankingSystem.BankDataManagement;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class UserFile {

	public static UserList loadUserList() {
		try {
			FileInputStream fileIn = new FileInputStream("userList.txt");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			UserList userList = (UserList) in.readObject();
			in.close();
			fileIn.close();
			return userList;
		} catch (IOException i) {
			i.printStackTrace();
			return null;
		} catch (ClassNotFoundException c) {
			System.out.println("UserList class not found");
			c.printStackTrace();
			return null;
		}
	}

	public static boolean saveUserList(UserList userList) {

		try {
			FileOutputStream fileOut = new FileOutputStream("userList.txt");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(userList);
			out.close();
			fileOut.close();
			System.out.print("Serialized data is saved in userList.txt");
			return true;

		} catch (IOException i) {
			i.printStackTrace();
			return false;
		}
	}

}
