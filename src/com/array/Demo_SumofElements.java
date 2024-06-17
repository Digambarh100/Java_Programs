package com.array;

public class Demo_SumofElements {

	public static void main(String[] args) {
		int arr[] = { 10, 50, 30, 40 };

		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];

		}
		System.out.println("Sum of all elemnets in array : " + " " + sum);

	}

}
