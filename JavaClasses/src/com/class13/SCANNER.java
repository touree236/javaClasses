package com.class13;

import java.util.Scanner;

public class SCANNER {

 public static void main (String[] args) {
		
		

		
		System.out.println("Enter your class day:: ");
		String day=scanner.nextLine();
		// chaining method , when you write 2 different commands in the same code line 
		if(day.trim().toLowerCase().equals("saturday")) {  // system still should be able to recoganize it even tho its lowercase
			System.out.println("Saturday is your Java class");
		}else if (day.equalsIgnoreCase("Sunday")) {
			System.out.println("Sunday is your Git Class");
		}else if (day.equals("tuesday")) {
		System.out.println("Tuesday is your SDLC class");
 } else if (day.equals("thursday")) {
	System.out.println("Tuesday is your Manual Testing class");
}else { 
System.err.println("Envalid Entry!please enter a valid class day");
}
scanner.close ();
		
	
		}
	
	}


