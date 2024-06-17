package com.if_Else_Conditions;

import java.util.Scanner;

public class Demo10_Temperature_Converter {

	// fahrenheit to celsius
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Input a degree in Fahrenheit: ");
		double fahrenheit = input.nextDouble();

		double celsius = ((5 * (fahrenheit - 32.0)) / 9.0);
		System.out.println(fahrenheit + " degree Fahrenheit is equal to " + celsius + " in Celsius");
		
		
		System.out.println("=========================================================");

		// celsius to fahrenheit to
		/*
		 * c = (5 (F-32)) / 9 )
		 * 
		 * F = (9c/5) + 32
		 */

		System.out.println("Input a degree in celsius: ");
		double celsius1 = input.nextDouble();

		double fahrenheit1 = (((9 * celsius1) / 5) + 32);
		System.out.println(celsius1 + " degree celsius is equal to " + fahrenheit1 + " in fahrenheit");

	}

}
