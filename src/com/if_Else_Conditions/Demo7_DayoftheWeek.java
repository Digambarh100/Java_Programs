package com.if_Else_Conditions;

import java.util.Scanner;

public class Demo7_DayoftheWeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Day no of week: ");
		int dayNo = sc.nextInt();
		String dayName = "";
		switch (dayNo) {
		case 1:
			dayName = "Monday";
			break;
		case 2:
			dayName = "Tuesday";
			break;
		case 3:
			dayName = "Wednesday";
			break;
		case 4:
			dayName = "Thursday";
			break;
		case 5:
			dayName = "Friday";
			break;
		case 6:
			dayName = "Saturday";
			break;
		case 7:
			dayName = "Sunday";
			break;
		default:
			dayName = "Invalid day range";

		}
		System.out.println(dayNo +" " + "is" + " " + dayName);
	}
}
