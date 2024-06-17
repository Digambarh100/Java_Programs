package com.for_loop_Conditions;

public class Demo06_EvenNo_1_100 {

	static void evenNo(int N) {
		int i;
		for (i = 1; i <= N; i++) /// from 1 to 100
		{
			// for (int i = 100; i >= 1; i--) // from 100 to 1
			{
				if (i % 2 == 0) {
					System.out.print(i + " ");

				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 100;
		evenNo(100);
	}

}
