package com.if_Else_Conditions;

import java.util.Scanner;

public class Demo2_Even_Odd_Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no: ");
		int num = sc.nextInt();

		if (num % 2 == 0) {
			System.out.println(num + " " + "is even no");
		} else {
			System.out.println(num + " " + "is odd no");
		}

	}

}
