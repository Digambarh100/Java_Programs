package com.array;

public class Demo_2D_Array_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           //                 0 index        1 st index          2nd index
		int arr[][] = { { 10, 20, 30 }, { 40, 50, 60,10,30 }, { 70, 80, 90 ,45 } };  //3

//		System.out.print(arr[0][0]+ " "); // 10
//		System.out.print(arr[0][1]+ " ");  //20
//		System.out.println(arr[0][2]+ " ");  //30
//		System.out.print(arr[1][0]+ " "); //40
//		System.out.print(arr[1][1]+ " "); //50
//		System.out.println(arr[1][2]+ " "); //60 
//		System.out.println(arr[1][3]+ " "); //10 
//		System.out.println(arr[1][4]+ " "); //30 
//		System.out.print(arr[2][0]+ " "); //70
//		System.out.print(arr[2][1]+ " "); //80
//		System.out.print(arr[2][2]+ " ");//90
//		System.out.print(arr[2][3]+ " ");//90
		
		System.out.println(arr[0].length); //3
		System.out.println(arr[1].length); //5  //
		System.out.println(arr[2].length); //4
		
		System.out.println("Array length : " + " " +arr.length);
		
		for( int i=0; i<arr.length; i++) {
			for ( int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
