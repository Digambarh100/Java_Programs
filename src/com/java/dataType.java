package com.java;

public class dataType {
	int a;
	float b;
	double c;
	char c1;
	String s1;
	boolean b1;

	public static void main(String[] args) {

		dataType d1 = new dataType();
		System.out.println(d1.a); // 0
		System.out.println(d1.b); // 0.0
		System.out.println(d1.c); // 0.0
		System.out.println(d1.c1); // \u0000
		System.out.println(d1.s1); // null
		System.out.println(d1.b1); // false

	}

}
