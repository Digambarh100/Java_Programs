package com.for_loop_Conditions;

public class Demo07_Factorial_with_Methods {

	public static void main(String[] args) {

		int result = factorial(4);
		System.out.println("factorial=" + result);
	}

	static int factorial(int number) {
		int facto = 1;
		for (int i = 1; i <= number; i++) {
			facto *= i;// facto=facto*i;
		}
		return facto;
	}

}
