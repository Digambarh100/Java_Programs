package com.if_Else_Conditions;

import java.util.Scanner;

public class Demo4_LeapYear {
	
	//leap year -> module divided by 4 and 400  => remainder is 0  &&& not divided by 100

	public static void main(String[] args) {
		String res;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter year: ");
		int year = sc.nextInt();

		res = (year % 4 == 0 && year % 100 != 0 || 
				year % 400 == 0) ? "is a leap year" : "is not a leap year";
		System.out.println(year + " " + res);
	}

}
