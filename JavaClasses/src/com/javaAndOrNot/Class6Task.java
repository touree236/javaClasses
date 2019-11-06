package com.javaAndOrNot;

import java.util.Scanner;

public class Class6Task {
	
	public static void main(String[] args) {
		/* 
		 * as user to enter month they were born 
		 * based on the month define the season
		 * if user born in juan feb, dec --> winter
		 * if in mar, apr, may -->spring 
		 * if jun, july , aug --> summer
		 * if sept, oct , nov --> fall 
		 * otherwise--> unknown 
		 * at the end of the program " you were born in" 
		 */
		
	  
	    
Scanner scan=new Scanner (System.in);
        
        System.out.println(" Please enter the month you were born");
        
        String month=scan.nextLine();
        String season = null;
        
        if (month.equals("january") || month.equals("february") || month.equals("december")){
            
            season="Winter";
        } else if (month.equals("march")|| month.equals("may")|| month.equals("may")) {
            season= "Spring";
        } else if ( month.equals("june")|| month.equals("july")|| month.equals("august")) {
             season=" Summer";
        }else if (month.equals("septemeber")|| month.equals("october")|| month.equals("november")) {
            season="Fall";
        } else {
            season="unknown";
        }
        
        System.out.println(" You were born in "+ season );
        System.out.println(month);
    }
}
	 

