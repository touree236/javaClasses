package com.syntax.class2review;

public class breakAndContinue {
	public static void main(String[] args) {
		// break keyword , breaks /exits the loop 
		
		for (int i=0; i<10; i++) {
			if (i==5) {
				break;
			}
			System.out.println(i);
		}
		
		System.out.println("I am outside of the loop");
		
		// continue - it will skip current iteration 
		
		for (int i=1; i<=5; i++);
		
		if (i==3  || i==4) { // if you want to skip like 3 and 4 ( if you just want to skip line 3 it will be i==3)
			continue;
		}
			System.out.println(i);
		}
			System.out.println("I am outside of the loop");	
	
	}


