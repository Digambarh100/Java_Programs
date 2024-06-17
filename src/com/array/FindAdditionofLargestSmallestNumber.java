package com.array;

public class FindAdditionofLargestSmallestNumber {

	public static void main(String[] args) {

		// numbers array
		int numbers[] = new int[] { 10,20,30,60,80,120 };

		
		int smallest = numbers[0];
		int largetst = numbers[0];
		int sum=0;

		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > largetst)
				largetst = numbers[i];
			else if (numbers[i] < smallest)
				smallest = numbers[i];
		}
		sum = smallest + largetst;

		System.out.println("Largest Number is : " + largetst);
		System.out.println("Smallest Number is : " + smallest);
		System.out.println("Addition of Largest & Smallest Number is : " + sum);
	}
}
