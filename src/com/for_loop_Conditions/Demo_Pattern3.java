package com.for_loop_Conditions;

public class Demo_Pattern3 {

//	 	*
//	   **
//	  ***
//	 ****
//	*****
//	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			int totalRows = 5;
		    for (int row = 1; row <= totalRows; row++) {
		        for (int sp= 1; sp<= totalRows - row; sp++) {
		            System.out.print(" ");
		        } 
		        for (int str = 1; str <=  row ; str++) {
		            System.out.print("*");
		        }
		        System.out.println();
		    }
		}}
	


