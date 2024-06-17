package com.methods;

public class Non_StaticMethod {

	public void test() {
		System.out.println("Non-Static Methods");
	}

	public static void main(String[] args) {
		Non_StaticMethod n1 = new Non_StaticMethod();

		// to call non static method

		// By using object of class
		n1.test();

	}

}
