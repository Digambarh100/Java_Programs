package com.array;

import java.util.Arrays;

public class Demo_Array_Merge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = { 40, 20, 90};
		int[] array2 = { 100, 110 };

		int[] copyarr = new int[array1.length + array2.length];

		for (int i = 0; i < array1.length; i++) {
			copyarr[i] = array1[i];
			System.out.println(copyarr[i]);
		}

		for (int i = array1.length; i < copyarr.length; i++) {
			copyarr[i] = array2[i - array1.length];
		}

		for (int i : copyarr) {
			System.out.print(i + " ");

		}
		System.out.println();

	}
}