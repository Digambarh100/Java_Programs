package com.if_Else_Conditions;

import java.util.Scanner;

public class Demo9_Grading_System {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Grades : ");
		String grade = sc.next();

		switch (grade) {
		case "A": {
			System.out.println("Student has scored above 90% ");
			break;

		}
		case "B": {
			System.out.println("Student has scored between 80 to 89 % ");
			break;
		}
		case "C": {
			System.out.println("Student has scored between 70 to 79 % ");
			break;
		}
		case "D": {
			System.out.println("Student has scored between 60 to 69 % ");
			break;
		}
		default: {
			System.out.println("failed");
		}
		}

	}

}
