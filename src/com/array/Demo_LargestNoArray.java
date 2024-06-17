package com.array;

public class Demo_LargestNoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 10, 7, 30, 40, 70, 80, 110, 165, 185, 176,90 };
		System.out.println("length of array :" + " " + arr.length);
		int largeNo = arr[0];  //assume
		for (int i = 1; i < arr.length; i++) //1<9
		{
			if (largeNo < arr[i]) //10<30 (i=2)
			{
				largeNo = arr[i];

			}
		
		}
		System.out.println("Largest No is : " + " " + largeNo);
		

	}

}