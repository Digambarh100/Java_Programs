package com.if_Else_Conditions;

import java.util.Scanner;

public class Demo3_Voting_Eligibility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age: ");
		int ageNum = sc.nextInt();

		if (ageNum >=18 ) {
			System.out.println(ageNum + " " + "is eligible for voting");
		} else {
			System.out.println(ageNum + " " + "is not eligible for voting");
		}

	}

}
