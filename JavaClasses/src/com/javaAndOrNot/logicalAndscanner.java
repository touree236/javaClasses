package com.javaAndOrNot;

import java.util.Scanner;

public class logicalAndscanner {
	
	public static void main(String[] args) {
		
		/* ask user to enter age
		 * if age is from 1 to 3 --> you r a baby
		 * if age is from 3-5 -->you are a toddler
		 * if age is from 5-12 --> kid 
		 * if age is from 12-19 --teenager 
		 * if age > 20 --> you are an adult 
		 */
		
	
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your age");
		
	int age= scan.nextInt();

	    	if (age>=1 && age<=3) { 
	    		System.out.println("U r a baby");
	    	}else if (age >3 && age <=5){
	    		System.out.println("U r a todler");
	    	}else if (age >5 && age <=12){
	    		System.out.println("U r kid");
	    	}else if(age >12 && age <19) {
	    		System.out.println("U R ternnager");
	    	}else if (age >19) {
	    		System.out.println("invlaid umber ");
	    		
	    	}
	    	}
	    	 
	    	
	    
		
		
	
	}

}
