package com.for_loop_Conditions;

public class Demo_ReverseNo {

	static void reverseofDigits(int number) {

		int rev = 0;
		// int revNumber;
		for (; number > 0;) {

			rev = number % 10;
			System.out.print(rev);
			number /= 10;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int N =1234;
		reverseofDigits(25);

	}
}
