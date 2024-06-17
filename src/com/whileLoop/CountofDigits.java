package com.whileLoop;

public class CountofDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 123564878;
		int count = 0;
		while (num > 0) {
			count++;
			num = num / 10;

		}
		System.out.println("Count of Digits : " + " " + count);

	}

}
