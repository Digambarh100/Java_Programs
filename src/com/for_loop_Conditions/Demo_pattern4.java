package com.for_loop_Conditions;

public class Demo_pattern4 {
	
//		*
//	   ***
//	  *****
//	 *******
//	*********

	
	
	
	public static void main(String[] args) {
	int totalRows = 5;
    for (int row = 1; row <= totalRows; row++) {
        for (int sp= 1; sp<= totalRows - row; sp++) {
            System.out.print(" ");
        }
        for (int str = 1; str <= 2* row-1 ; str++) {
            System.out.print("*");
        }
        System.out.println();
    }
}}
