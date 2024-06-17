package com.java;

public class SwapNo_WithOut_3rd_Variable {

	public static void main(String[] args) {
		int a = 20;
		int b = 30;

		a = a + b; // 20+30 = 50
		b = a - b; // 50-30 = 20
		a = a - b;
		
		System.out.println("SwapNo_WithOut_3rd_Variable ");
		System.out.println("a" + " = " + a);
		System.out.println("b" + " = " + b);
	}

}
