package com.variables;

public class Static_Variable {
	static int a = 12;  // class  ====class area
	int b = 12;  //instance variable =====> object  =====in heap area

	static {
		System.out.println("Static block executes first");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Static_Variable s1 = new Static_Variable();
		s1.test();
		s1.test(); // no object is created again for that, same object created
		s1.test();
		
		System.out.println("====================================");

		Static_Variable s2 = new Static_Variable();

		s2.test(); 
		
		
		System.out.println("====================================");

		Static_Variable s3 = new Static_Variable();

		s3.test();

	}

	void test() {
		a++;
		b++;
		System.out.println("a :" + a);
		System.out.println("b :" + b);
	}

}
