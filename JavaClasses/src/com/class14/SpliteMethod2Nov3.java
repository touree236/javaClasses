package com.class14;

import java.lang.reflect.Array;

public class SpliteMethod2Nov3 {
	private static final int i = 0;
	private Object array;

	public static void main(String[] args) {
		
		
		// how to  separated comma delimited string.
		
		String str="If you come early , then you can study more, also you can leanr more ,and you can leave early";
		
		
		
		
		String[] array=str.split(","); 
		for (int i= 0; i< array.length;i++);
		System.out.println(array[i]);
		
	
		System.out.println("******************");
		
		String str1="Welcome to Syntax Technologies";
		String[] array2=str1.split(" ",3);
		System.out.println(array2.length);
		
		for (int i=0; i< array.length; i++) {
			System.out.println(array2[i]);
		
		
		
		}
		
		
		
		
	}
	
	
	

}