package com.java;

public class Unary_PostIncrement {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b =0;
		int a=10;
		int c=20;
		
		b=a++;
		System.out.println(b);  //10  first do assignemet part ( a is b)
		System.out.println(a);  //11  post increment part
	
		System.out.println(b);  //10  
		
		c++;
		System.out.println(c);  //10  
	
		
	}

}
