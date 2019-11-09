package com.class14;

public class stringminipulationNov7 {
   
	public static void main(String[] args) {
		

	// java development kit  JDK 
	// String class comes in java lang package // String is a sequence of characters 
	// 2 ways to creat a string 
	//1st way 
	String str="Hello"; // most oficiant is string litiral 
	//second using new keyworkd- creating a string object 
	String str1=new String ("hello");
	System.out.println(str1);
	// case coversion methods/functions 
	str=str.toLowerCase().toUpperCase(); // it will print HELLO ( this method is called chaining 
			System.out.println(str);// also this will print HELLO 
	
	// verify if there if the string is Empty 
			String myString=""; // in this string we assigned empty value 
			boolean isEmpty=myString.isEmpty();
			System.out.println(isEmpty);
	
			
			String myString1=null;// no value at all it is equal to 
			//String myString1;
			System.out.println(myString1.isEmpty());
			
			// how to verify existence of Characters in the string 
			String a="Good evening student";
			boolean exist=a.contains("students");
			System.out.println(exist);
			System.out.println(a.startsWith("Good"));
			System.out.println(a.endsWith("student"));
			
			
	}
	
}
