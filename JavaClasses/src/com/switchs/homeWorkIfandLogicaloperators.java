package com.switchs;

import java.util.Scanner;

public class homeWorkIfandLogicaloperators {
	
	public static void main(String[] args) {
		
		/*
		 * Write a program to find largest of three double values using if-else..
		 * if and logical operators provided by a user (numbers must be distinct)
		 */
		
			Scanner Scan;
	            double num1=40;
	            double num2 = 20; 
	            double num3 = 5; 
	          
	          Scanner scan=new Scanner(System.in);
		  
	        	if ( num1>= num2 && num1 >= num3) {
	        	System.out.println(num1 + "is largest");
	        	
	           } else if (num2>=num1 && num2>=num3) {
	           System.out.println( num2 + "is largest");
               } else { 
               System.out.println(num3 +" is largest");
	 
	} 		
	}
	}




