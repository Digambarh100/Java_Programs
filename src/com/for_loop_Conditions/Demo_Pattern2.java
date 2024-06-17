package com.for_loop_Conditions;

public class Demo_Pattern2 {
//	*****
//	****
//	***
//	**
//	*
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int totalRow = 5;
		for ( int row=1; row <=totalRow; row++) {
			for(int str=1; str <= totalRow-row+1; str++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
