package com.revature.BankingSystem.BankingUI;

import java.util.Scanner;

public class UserInput {
	/*
	 * makes managing user input easier. conditions to user input
	 */
	private Scanner userInput;

	public UserInput() {
		userInput = new Scanner(System.in);
	}

	public String getWord() {
		return userInput.next();
	}

	public String getString() {
		return userInput.nextLine();
	}

	public int getInt() {
		return userInput.nextInt();
	}

	public int getInt(int a, int b) {
		int in = userInput.nextInt();
		while (in < a ^ in > b) {
			System.out.println("Invalid Input - Enter Interger between " + a + " and " + b);
			in = userInput.nextInt();
		}

		return in;
	}

	public double getDouble() {
		return userInput.nextDouble();
	}

	public double getDouble(boolean positive) {
		double in = userInput.nextDouble();
		while (in < 0) {
			System.out.println("Invalid Input - Enter positive number");
			in = userInput.nextDouble();
		}

		return in;
	}
}