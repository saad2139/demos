package com.revature.Homework1.Q19;

import java.util.ArrayList;

public class Q19 {
	//make an arraylist with 1-10
	static boolean isPrime(int n) {
		if (n == 1) {
			return false;
		}
		if (n == 2) {
			return true;
		}
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		for (int i = 1; i <= 10; i++) {
			numbers.add(i);
		}

		System.out.println("numbers list: " + numbers);

		//get sum of evens and odds
		int sumEven = 0;
		int sumOdd = 0;
		for (int i = 0; i < numbers.size(); i++) {
			if (numbers.get(i) % 2 == 0) {
				sumEven += numbers.get(i);
			} else {
				sumOdd += numbers.get(i);
			}
		}
		System.out.println("Sum of evens: " + sumEven);
		System.out.println("Sum of odds: " + sumOdd);
		
		//remove primes
		for (int i = 0; i < numbers.size(); i++) {
			if (isPrime(numbers.get(i))) {
				numbers.remove(i);
				i--;
			}
		}
		System.out.println("Non-prime numbers list: " + numbers);

	}
	
}