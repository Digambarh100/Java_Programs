package com.for_loop_Conditions;

public class FabonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=0;
		int n2=1;
		int next;
        System.out.print(n1+ "  "+n2+" ");
		for(int i=0;i<=10;i++) {
			next=n1+n2;
			System.out.print(next+" ");
			n1=n2;
			n2=next;

		}

	}

}