package com.if_Else_Conditions;

import java.util.Scanner;

public class Demo1_Positive_Negative_ZeroCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");  
		int num = sc.nextInt();

		if (num > 0) {
			System.out.println(num + " " + " is positive no");
		} else if (num < 0) {
			System.out.println(num + " " + " is negative no");
		} else {
			System.out.println(num + " " + " is equal to  Zero");
		}

	}

}
