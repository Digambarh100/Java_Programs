package com.array;

public class Demo_SumofArraywithMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 10, 50, 30, 40, 60 };
		Demo_SumofArraywithMethod a1 = new Demo_SumofArraywithMethod();
		int result =a1.arr(a);
		System.out.println("Sum of Elements : " + result);
	}

	int arr(int a[]) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		return sum;
	}

}
