package com.for_loop_Conditions;

public class Demo_SumofDigits {
	
static void sumofDigits(int number) {
	
	int sum = 0;
	for (int i = 1; number > 0; i++) {

		sum = sum + number % 10;  //0 + 6
		number = number / 10;

	}
	System.out.print(sum);

}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 123456;
		sumofDigits(123456);
		
	}	
}
