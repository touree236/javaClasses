package com.class14;

public class ToCarArrayMethod {
	public static void main(String[] args) {
		
		
		
		// new method converts this string to a new character array
		
		String str="Syntax";
		str.toCharArray();
		
		char[] array=str.toCharArray();   
		for (char i:array) {
			
		System.out.println(i); 
		
		}		
		System.out.println(array); // or you can print it this way 
		
	}

}