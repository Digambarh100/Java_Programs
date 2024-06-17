package com.for_loop_Conditions;

public class Demo03_SumofNaturalNos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int n = 1000;

	//	for (int i = 1; i <= 1000; i++) {
			 for (int i = n; i >= 1; i--) {
			
			sum = sum + i; //0+1 //1+1=2 //
		}
		System.out.println("Sum of natural nos from 1 to 1000 is " + " " + sum);
	}

}
