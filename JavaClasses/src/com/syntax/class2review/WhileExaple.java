package com.syntax.class2review;

import java.util.Scanner;

public class WhileExaple {

	public static void main(String[] args) {
		
		/* ask user if its is raining if not ( true  or false
		 * as long as there is rain lets keep asking 
		 * as soon as there is no rain --> you can go to the park
		 *  this is a do while loop 
		 */ 
		
		scanner scan;
		Scanner Scan=new Scanner(System.in);
		
		boolean isRain= true;
		
		do { 
			System.out.println("It it raining?");
			isRain=Scan.nextBoolean();
			
		} while(!isRain); 
		System.out.println("Go to the park");
		
	}	
}
