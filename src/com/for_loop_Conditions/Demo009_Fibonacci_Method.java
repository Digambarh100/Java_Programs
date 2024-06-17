package com.for_loop_Conditions;

public class Demo009_Fibonacci_Method {

	 static void fibonacciSeries(int N) {

		int n1 = 0, n2 = 1;

		for (int i = 0; i < N; i++) {
			// Print the number
			System.out.print(n1 + " " + n2);

			int n3 = n2 + n1;
			n1 = n2;
			n2 = n3;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int N = 10;
		//Demo009_Fibonacci obj = new Demo009_Fibonacci();
		// Function Call
		//obj.fibonacciSeries(10);
		fibonacciSeries(10);
		
	}
}
