package com.class4;

import java.util.Scanner;

public class ScannerExpale {

	public static void main(String[] args) {
		
//scanner is Class in Java that allow us to take an input from a user
//scanner will help us to make our program more interactive 
		
		Scanner scan= new Scanner(System.in); 
		System.out.println("Plase enter any number");
		
		/* nextInt();-> for numbers
		 * nextLine(); Strings
		 * nextDouble(); -> double 
		 */
		 
        int number=scan.nextInt(); // make sure to memorise this line 
        System.out.println("Entered number is" + number);
        
        System.out.println("***************");
        
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your name");
        String name=input.nextLine();
        System.out.println("Good afternoon "+name);
        
        
	}
	
	

}

