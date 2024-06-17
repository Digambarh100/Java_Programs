package com.constuctor;

public class Demo_ConstructorinJava {
	
	// Constructor is not allowed for static, final, abstract, syncronized   ==> compile type error
	// it does not return type
	// invoked when object is created
	// name of constructor is same as class name
	
	Demo_ConstructorinJava (){
		System.out.println("inside parameterless constructor");   
	}
	

	

	Demo_ConstructorinJava (int a , int b, String s , float d){
		System.out.println("inside parameter constructor ");  
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Method is starts"); 
		Demo_ConstructorinJava c1 = new Demo_ConstructorinJava();  //- Demo_ConstructorinJava() - become constructor
		// constructor is invoked when object is created
	
		
		Demo_ConstructorinJava c2 = new Demo_ConstructorinJava(22,25,"Ram",30.25f);  //parametized onstructor
		System.out.println("Method is ends");  //
	}

}
