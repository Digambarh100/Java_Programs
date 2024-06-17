package com.This;

public class Employee_ {

	 int id;  //instanevariLE
		 public int getId() {
		 return id;
		 }
		 public void setId(int id) //localvariable
		 {
		 this.id = id;
		 }
		 public static void main(String[] args) {
			 Employee_ e  = new Employee_();
		 e.setId(101);
		System.out.println("Emp Id="+e.getId());
		 }
		 
	}


