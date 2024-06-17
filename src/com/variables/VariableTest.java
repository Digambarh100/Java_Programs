package com.variables;

public class VariableTest {
	int global = 12;

	public void subtract(int a, int b) { 
	VariableTest var = new VariableTest(); 
	System.out.println("Inside subtract>>"+var.global); 
	int c = a - b; 
	System.out.println("c>>"+c); 
	}

	public static void main(String[] args) {
		VariableTest varTest = new VariableTest();
		System.out.println("global>>" + varTest.global);
		varTest.subtract(100, 20);
	}
}