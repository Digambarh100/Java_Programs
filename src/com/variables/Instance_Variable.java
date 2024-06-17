package com.variables;

/*
 *   If the value of a variable is varied from object to object such type of variables are called 
instance variables. 
 For every object a separate copy of instance variables will be created.  
 Instance variables will be created at the time of object creation and destroyed at the time 
of object destruction hence the scope of instance variables is exactly same as scope of 
objects.  
 Instance variables will be stored on the heap as the part of object.  
 Instance variables should be declared with in the class directly but outside of any 
method or block or constructor. 
 * 
 * 
 */
public class Instance_Variable {
 int a = 11;
 int b;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Instance_Variable obj1 = new Instance_Variable();
		System.out.println(obj1.a);
		System.out.println(obj1.b);
	}

}
