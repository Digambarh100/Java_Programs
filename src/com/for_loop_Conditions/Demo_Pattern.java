package com.for_loop_Conditions;

public class Demo_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/* 
	 rows    str ( clo )
	 1        1
	 2        2
	 3       3	
	  4       4	
	 */
		
//		*
//		**
//		***
//		****
//		*****
		
		
		
		int totalRow=5;
		for (int row =1; row<=totalRow; row++) {
			for( int str=1; str<=row; str++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
