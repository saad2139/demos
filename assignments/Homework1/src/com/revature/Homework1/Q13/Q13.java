package com.revature.Homework1.Q13;

public class Q13 {
	//display fancy pattern
	public static void main(String[] args) {
		
		String prevString = "0";
		
		//place number on left side or right
		//initial 0 is on the 'right' of nothing
		boolean right = false;
		int n = 1;
		
		System.out.println(prevString);
		
		for(int i = 0; i<3; i++) {
			//which side do you append to.
			if(right) {
				prevString = prevString+" "+n;
				right = false;
			}else {
				prevString = n+" "+prevString;
				right = true;
			}
			//looks at ends for same char; flips to 1 or 0 as needed
			if(prevString.charAt(0) == prevString.charAt(prevString.length()-1)) {
				if(n == 0) {n = 1;}
				else {n= 0;}
			}
			System.out.println(prevString);
		}
	}
}