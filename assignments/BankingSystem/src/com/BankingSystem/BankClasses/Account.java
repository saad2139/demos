package com.BankingSystem.BankClasses;

import java.io.Serializable;

public class Account implements Serializable {
	/**
	 * Thing that hold money. Unique ids created from number of accounts
	 */
	private static final long serialVersionUID = -5816034044913084190L;
	private int accId;
	private String accType;
	private double accBalance;
	private User accOwner;
	private static int numberOfAccounts;

	public Account(String accType, double accBalance, User accOwner) {
		super();
		this.accType = accType;
		this.accBalance = accBalance;
		this.accOwner = accOwner;
		accId = numberOfAccounts;
		numberOfAccounts++;
	}

	public int getAccId() {
		return accId;
	}

	public String getAccType() {
		return accType;
	}

	public void setAccType(String accType) {
		this.accType = accType;
	}

	public double getBalance() {
		return accBalance;
	}

	public void setBalance(double Balance) {
		this.accBalance = Balance;
	}

	public User getAccOwner() {
		return accOwner;
	}

	public void setAccOwner(User accOwner) {
		this.accOwner = accOwner;
	}

	public int getNumAcc() {
		return numberOfAccounts;
	}

	public void setNumAcc(int n) {
		numberOfAccounts = n;
	}

	@Override
	public String toString() {
		return "Account [accId=" + accId + ", accType=" + accType + ", Balance=" + accBalance + "]";
	}

}