package com.syntax.class2review;

public class LoopTask {
	public static void main(String[] args) {
		
	
		
	/*
	 * write a code to find the sum of even and odd numbers 
	 * form range 1-20
	 * expecting 2 outputs 
	 * sum for odd number =.....
	 * sum of even numbers =.........
	 */
		
		int sumeven= 0;
		int sumodd=0;
		
		for( int i=1; i<=20; i++) {
		
		if ( i%2==0) {  /// this is the step to find odd or even number 
			sumeven= sumeven+i;
		}else {
			sumodd= sumodd+i;
		}
		}
			System.out.println("The total of all even#-" +sumeven);
			System.out.println("The total of all odd#=" +sumodd);
		
		// System.out.println("sumeven"+ sumeven); // or you can print it hatems way 
		// System.out.println("sumodd"+ sumodd);
	}
	}
	

	
	