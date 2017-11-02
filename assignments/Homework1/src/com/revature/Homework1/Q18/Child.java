package com.revature.Homework1.Q18;

import java.nio.CharBuffer;

public class Child extends Parent{
	private CharBuffer capList;
	
	public Child() {
		capList = CharBuffer.allocate(26);
		for(int i = 0; i < capList.capacity(); i++) {
			capList.append((char) ('A'+i));
		}
		
	}
	
	@Override
	public boolean uppercaseLettersExist(String arg) {
		if(arg.contains(capList)) {
			return true;
		}
		return false;
	}

	@Override
	public String upperToLower(String arg) {
		return arg.toUpperCase();
	}

	@Override
	public void toIntAdd10(String arg) {
		int number = 0;
		for(int i = 0; i< arg.length(); i++) {
			number += (int)arg.charAt(i);
		}
		System.out.println(number + 10);
		
	}

}