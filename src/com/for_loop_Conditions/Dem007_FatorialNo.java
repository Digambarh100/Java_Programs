package com.for_loop_Conditions;

import java.util.Scanner;

public class Dem007_FatorialNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Factorial Number : ");
		int num = input.nextInt();
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact *= i;
		}
		System.out.println("Factorial: " + fact);
	}

}
