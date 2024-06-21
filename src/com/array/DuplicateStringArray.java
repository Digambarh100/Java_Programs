package com.array;

public class DuplicateStringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String [] arr = new String [] {"Java","C","Java","C++","Ruby","C++","Python","Ruby"};   
		
        System.out.println("Duplicate String elements in given array  : ");  
        //Searches for duplicate element  
        for(int i = 0; i < arr.length; i++) {  
            for(int j = i + 1; j < arr.length; j++) {  
                if(arr[i] == arr[j])  
                    System.out.println(arr[j]);  
            }  
        } 
}
}