package com.array;

public class Demo_ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 10, 20, 30, 40, 50, 60, 70 };  //7
		//             0   1   2  3    4   5   6
		
		System.out.println("Array Length : " + arr.length);
		System.out.println("Enter original Array elements : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println();

		System.out.println("Enter reverse Array elements : ");
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}

	}
}
