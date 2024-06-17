package com.if_Else_Conditions;

import java.util.Scanner;

public class Demo6_LetterGradeConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter percentage Score : ");
		int percentage = sc.nextInt();

		if (percentage >= 90 && percentage < 100) {
			System.out.println("Graade for 90-100% is : A ");
		} else if (percentage >= 80 && percentage < 90) {
			System.out.println("Graade for 80-90% is :  B ");
		} else if (percentage >= 70 && percentage < 80) {
			System.out.println("Graade for 70-80% is :  C ");
		} else if (percentage >= 60 && percentage < 70) {
			System.out.println("Graade for 60-70% is :  D ");
		} else if (percentage <60) {
			System.out.println("Graade for below 60% is : E  & result is fail");
		}
	}

}
