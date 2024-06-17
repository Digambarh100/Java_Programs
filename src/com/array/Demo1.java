package com.array;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 10, 20, 60, 40 };
		
		System.out.println("Length of Array a :" + " " + a.length);

//		for (int i = 0; i <a.length; i++) 
//		{
//			
//			System.out.println(a[i]);
//		}
//		
		
		for( int i:a) {
			System.out.println(i);
		}
		
		int b[] = new int[10];
System.out.println("b[2] =" + " " + b[2]);
		System.out.println("Length of Array b :" + " " + b.length);

		for (int element: b) {
			System.out.print(element + " ");  /// 10 times zero
		}
	}

}
