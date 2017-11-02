package com.revature.BankingSystem.BankClasses;

import java.util.ArrayList;

public class ClientUser extends User {
	/**
	 * Clients store a list of their accounts
	 */
	private static final long serialVersionUID = 6474810219741580587L;
	private ArrayList<Account> Accounts;

	public ClientUser() {
		super();
		Accounts = new ArrayList<Account>();
	}

	public ClientUser(String userName, String firstName, String lastName, String password) {
		super(userName, firstName, lastName, password);
		Accounts = new ArrayList<Account>();
	}

	public void addAccount(String accType, double accBalance) {
		Accounts.add(new Account(accType, accBalance, this));
	}

	public void removeAccount(int i) {
		Accounts.remove(i);
	}

	public ArrayList<Account> getAccounts() {
		return Accounts;
	}

	@Override
	public String toString() {
		return "Client User [userId=" + userId + ", userName=" + userName + ", firstName=" + firstName + ", lastName="
				+ lastName + "]";
	}
}