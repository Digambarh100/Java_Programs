package com.if_Else_Conditions;

import java.util.Scanner;

public class Demo11_Simple_Bank_ATM {

	public static void main(String[] args) {
		int balance = 50000, withdraw, deposit;
		Scanner sc = new Scanner(System.in);
		System.out.print("Choose the operation you want to perform in ATM:");
		int n = sc.nextInt();

		switch (n) {
		case 1: {
			System.out.print("Enter money to be withdrawn:");
			withdraw = sc.nextInt();
			if (balance >= withdraw) {
				balance = balance - withdraw;
				System.out.println("Remaining Balance after withdraw" + " " + balance);
				System.out.println("Please collect your money");
			} else {
				System.out.println("Insufficient Balance");
			}
			System.out.println("");
			break;

		}
		case 2: {
			System.out.print("Enter money to be deposited:");
			deposit = sc.nextInt();
			balance = balance + deposit;
			System.out.println("Your Money has been successfully depsited");
			System.out.println("");
			break;
		}
		case 3: {
			System.out.println("Balance : " + balance);
			System.out.println("");
			break;

		}
		default: {
			System.out.println("Failed");

		}
		}
	}
}