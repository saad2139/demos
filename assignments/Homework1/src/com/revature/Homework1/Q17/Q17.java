package com.revature.Homework1.Q17;

import java.util.Scanner;

public class Q17 {
	//caculate thing based on user input
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter principal: ");
		Float principal = new Float(input.nextLine()+"f");
		System.out.print("Enter rate: ");
		Float rate = new Float(input.nextLine()+"f");
		System.out.print("Enter time: ");
		Float time = new Float(input.nextLine()+"f");
		System.out.println("Principal: " +principal+", Rate: "+rate+", Time: "+time);
		System.out.println("Interest: "+ principal*rate*time);
		input.close();
	}

}
