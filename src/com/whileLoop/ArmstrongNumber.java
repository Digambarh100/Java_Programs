package com.whileLoop;

public class ArmstrongNumber {

	public static void main(String[] args) {

		// Input: 153 , Output: Yes
		// 153 is an Armstrong number. ==> (1*1*1) + (5*5*5) + (3*3*3) = 153
		
		
		int sum = 0, res, temp;
		int num = 153;// It is the number to check Armstrong
		temp = num;
		while (num > 0) {
			res = num % 10;  // 3  //5   //1
			num = num / 10;  //15  //1  //0
			sum = sum + (res * res * res); //27  //125   //1
		}
		if (temp == sum)
			System.out.println(temp + " is armstrong number");
		else
			System.out.println(temp + " is Not armstrong number");
	}
}