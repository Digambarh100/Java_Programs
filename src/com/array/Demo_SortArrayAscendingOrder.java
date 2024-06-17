package com.array;

public class Demo_SortArrayAscendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 10, 30, 50, 40, 60, 20, 70, 80 };
		System.out.println("Lendgth of array: " + " " + arr.length); // 8
		int temp = 0;
		// Displaying elements of original array
		System.out.println("Elements of original array: ");
		

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		// Sort the array in ascending order
		for (int i = 0; i < arr.length; i++) // 8
		{
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) // 10 >30 //10>50 ===30>50 //30>20
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println();
		// Displaying elements of array after sorting
		System.out.println("Elements of array sorted in ascending order: ");
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("Highest no in array is : " + arr[arr.length-1]); //80
		System.out.println("2nd Highest no in array is : " + arr[arr.length-2]); //700
		System.out.println("lowest no in array is : " + arr[0]); //10
		System.out.println("2nd lowest no in array is : " + arr[1]); //10
}}
