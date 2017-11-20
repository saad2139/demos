package com.revature.Homework1.Q1;

public class Q1 {
//integer bubble sort
	public static void main(String[] args) {
		int[] list = {100,0,5,6,3,2,3,7,9,8,4};
		System.out.println("original: "+ arrString(list));
		int[] sortedList = Bubblesort(list);
		System.out.println("original: "+ arrString(sortedList));

	}
	public static int[] Bubblesort(int[] input) {
		for(int i = 0; i < input.length; i++) {
			
			for(int j = 0; j <input.length-1-i; j++) {
				//check neighbors
				if(input[j] > input[j+1]) {
					//swap
					input[j+1] = input[j] + input[j+1];
					input[j] = input[j+1] -  input[j];
					input[j+1] = input[j+1] -  input[j];
				}
			}
		}
		return input;
	}
	//just a method to print int arrays nicely
	public static String arrString(int[] input) {
		String output = "{";
		for(int i = 0; i < input.length; i++) {
			output+= input[i];
			if(i != input.length-1) {
				output+=",";
			}
		}
		output+="}";
		return output;
	}
	

}