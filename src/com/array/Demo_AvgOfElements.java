package com.array;

public class Demo_AvgOfElements {

	public static void main(String[] args) {
		int arr[] = { 10, 50, 30, 40, 100, 70 };

		int sum = 0;
		int length = arr.length;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];

		}
		System.out.println("Sum of all elemnets in array : " + " " + sum);
		System.out.println("Length of array : " + " " + length);
		double avg = sum / length;

		System.out.println("Average of all elemnets in array : " + " " + avg);

	}

}
