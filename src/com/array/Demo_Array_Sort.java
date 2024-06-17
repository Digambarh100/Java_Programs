package com.array;

import java.util.Arrays;

public class Demo_Array_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array1[] = { 40, 20, 90, 50, 60, 80, 70 };
		int array2[] = { 100, 110, 120 };
		System.out.println("Enter Original Array : ");
		for (int i : array1) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("Enter Array after sorting method: ");

		Arrays.sort(array1);

		for (int i : array1) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		
	

		
		}
	}


