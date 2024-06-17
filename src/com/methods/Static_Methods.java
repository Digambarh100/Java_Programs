package com.methods;

public class Static_Methods {

	public static void test() {
		System.out.println("Static Methods");
	}

	public static void main(String[] args) {
		Static_Methods s1 = new Static_Methods();

		// to call static method

		// By using object of class
		s1.test();

		// By using class name
		test();

		// By using method name
		Static_Methods.test();

	}

}
