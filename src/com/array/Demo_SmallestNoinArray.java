package com.array;

public class Demo_SmallestNoinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 10, 7, 30, 40, 70, 80, 110, 90 };
		int smallNo = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (smallNo > arr[i]) {
				smallNo = arr[i];

			}
		}
		System.out.println("Smallest No is : " + " " + smallNo);
	}

}
