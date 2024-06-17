package com.This;

public class Student {

	// 1. this can be used to refer current class instance variable
	// 2. this can be used to invoke current class method (implicitly)  -if we have not added this keyword then compiler is invoke this
	// 3. this() can be used to invoke current class constructor

	// 1. this can be used to refer current class instance variable
	String studentName; // instance
	int StudentID;

	Student(String name, int id)// local variable
	{
		this.studentName = name;
		this.StudentID = id;
	}

	void printStudentInfo() {
		System.out.println("Name of student is=" + studentName);
		System.out.println("Name of studentID is=" + StudentID);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1 = new Student("ajay", 1001);
		//s1.printStudentInfo();  -> class variable
		s1.m2();
	}

	void m1() {
		System.out.println("This is m2 method");
	}

	void m2() {
		this.m1();//m1(); - >compiler is automatially add this keyword
	}
}
