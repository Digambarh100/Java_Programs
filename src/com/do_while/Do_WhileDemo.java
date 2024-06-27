package com.do_while;

import java.util.Scanner;

public class Do_WhileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int option = 0;
		System.out.println("Simple Calculator");
		do {
			System.out.println("Enter option for Calculation :");
			Scanner sc = new Scanner(System.in);

			option = sc.nextInt();
		} while (option > 7);

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Nos : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int result = 0;

		switch (option) {
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
		case 6: {
			result = a * a;
			System.out.println("Square of first digit" + " " + result);
			break;

		}
		case 7: {
			result = a * a * a;
			System.out.println("Cube of first digit" + " " + result);
			break;
		}
		default:
			System.out.println("invalid Function");
		}
	}

}
