package com.revature.Homework1.Q15;

public class Q15 {
	/*
	 * define a interface; add,sub,mult,div
	 * implement interface in a class
	 */
	public static void main(String[] args) {
		Pair A = new Pair(4,2);
		Pair B = new Pair(5,6);
		System.out.println(A +" + "+ B +" = " + A.addition(A, B));
		System.out.println(A +" - "+ B +" = " + A.subtraction(A, B));
		System.out.println(A +" * "+ B +" = " + A.multiplication(A, B));
		System.out.println(A +" / "+ B +" = " + A.division(A, B));
	}

}
