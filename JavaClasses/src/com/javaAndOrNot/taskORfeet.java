package com.javaAndOrNot;

public class taskORfeet {
	public static void main(String[] args) {
		
		   /* Prompt the user to enter person heights in inches. 
	         * Person should be classified as one of the following:
	         * short (under 5 feet)
	         * medium(5 to 6 feet)
	         * tall (6 feet and over) 
			 */
		
		int feet = 6;
		
		if (feet>5) { 
			System.out.println("Sort");
		}else if (feet<=5 && feet>=6) {  
			System.out.println("medium");
		}else if (feet>=6) {  
			System.out.println("tall");

		
	}

}
}