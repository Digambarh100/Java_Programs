package com.if_Else_Conditions;

import java.util.Scanner;

public class Demo8_Simple_Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		Scanner sc = new Scanner(System.in);
		System.out.println("Simple Calculator");
		//int key = 1;
	
		System.out.println("Enter 1st No: ");
		int a = sc.nextInt();
		System.out.println("Enter 2nd No: ");
		int b = sc.nextInt();
		int result = 0;
		System.out.println("Enter Calculator Option:  "
				+ "1 - Addition" +" "+"2 - Substraction" + " "+ "3 - Division"+" "+"4-Multifiation"+" "+"4-Module"+" ");
		int key = sc.nextInt();
		switch (key) {
		case 1: {

			result = a + b;
			System.out.println("Addition Function" + " " + result);
break;
		}
		case 2: {
			result = a - b;
			System.out.println("Substraction Function" + " " + result);
			break;
		}
		case 3: {
			result = a / b;
			System.out.println("Division Function" + " " + result);
			break;
		}
		case 4: {
			result = a * b;
			System.out.println("Multifiation Function" + " " + result);
			break;
		}
		case 5: {
			result = a % b;
			System.out.println("Modulus Function" + " " + result);
			break;
			
		}
		case 6:{
			result = a*a;
			System.out.println("Square of first digit" + " " + result);
			break;
			
		}
		case 7:{
			result = a*a*a;
			System.out.println("Cube of first digit" + " " + result);
			break;
		}
		default:
			System.out.println("invalid Function");
		}
	}

}
