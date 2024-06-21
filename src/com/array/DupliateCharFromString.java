package com.array;

public class DupliateCharFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Programming Language";
		System.out.println("The string is :" + str);
		char[] carray = str.toCharArray();
		System.out.println("Duplicate String elements in given array  : ");
		// Searches for duplicate element
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				if (carray[i] == carray[j]) {
					System.out.print(carray[j] + " ");
					break;
				}
			}
		}
	}
}