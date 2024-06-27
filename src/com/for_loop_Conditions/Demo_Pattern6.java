package com.for_loop_Conditions;

public class Demo_Pattern6 {
	
	/*///////
	 
	*********
	 *******
	  *****
	   ***
	    *
	    
	   //// */


	public static void main(String[] args) {

		int totalRows = 5;
		for (int row = 1; row <= totalRows; row++) {
			for (int sp = 1; sp <= row - totalRows + 4; sp++) {
				System.out.print(" ");
			}
			for (int str = 1; str <= 2 * (totalRows - row) + 1; str++) {
				System.out.print("*");
			}
			System.out.println();

		}
	}
}