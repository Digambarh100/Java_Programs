package com.for_loop_Conditions;

public class Demo_DiamondPattern {

	public static void main(String[] args) {
		int totalRows = 5;
				
		for (int row = 1; row <= totalRows; row++) {
			for (int sp = 1; sp <= totalRows - row; sp++) {
				System.out.print(" ");
			}
			for (int str = 1; str <= 2 * row - 1; str++) {
				System.out.print("*");
			}
			System.out.println();

		}

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
