package com.class25;

public class CanWeOverload {
	
	// can we overload a private method? yes 
	// can we overload a static method? yes 
	
	private void methodOne() {
		System.out.println(" I am method one ");
	}
	private void methodOne( String str) {
		System.out.println("I am method one with "+str);
	}
     // Can we overload main method? yes .. see steps below 
	
	public static void main(String[] args) {
		System.out.println("I am method one with String Array");
	}
	
public static void main(String str) {
	System.out.println("I am main method with String arrgument");
	}

public static void main ( String str, String[]args) {  
	System.out.println(" I am a main method with 2 parameters");
	CanWeOverload.main("String");
	String[] array= {"A","B"};
	main("Hello",array);
	
}     


}