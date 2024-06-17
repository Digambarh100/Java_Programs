package com.for_loop_Conditions;

public class Demo10_Multification_Table {

	static void multificationTable(int N) {
		int i;
		int j;
		for (i = 1; i <= N; i++) { // 1 2
			for (j = 1; j <= 10; j++) {
				System.out.printf("%5d ", i * j); // 1*1 1*2 1*3
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 10;
		multificationTable(10);

	}
}
