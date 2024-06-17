package com.for_loop_Conditions;

public class Demo_Pattern5 {
	
//	*****
//	 ****
//	  ***
//	   **
//	    *

	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int totalRow = 5;
		for (int row = 1; row <= totalRow; row++) {
			for (int sp = 1; sp <= row - totalRow + 4; sp++) {
				System.out.print(" ");
			}
			for (int st = 1; st <= totalRow - row + 1; st++) {
				System.out.print("*");
			}
			System.out.println();

		}

	}
}
