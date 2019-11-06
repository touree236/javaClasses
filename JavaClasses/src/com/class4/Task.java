package com.class4;

public class Task {
	/* write a program to store a boolean value of whether user has diploma or not 
	 * if user has diploma , you should say congrats 
	 * otherwise program should say "get degree" 
	 * the program should check gpa score 
	 * if gpa score is higher or equal to 3.5 --> out should sare " you are eligible for scholarship 
	 * othweise --> " you should say study harder".  
	 */
	
	public static void main(String[] args) {

	boolean diploma= true;
	double Gpa=3.5;

		if (diploma) {
			System.out.println("Congrats");
			
		 if (Gpa >3.5) {
		
			System.out.println("you are eligible for scholarship");
			
		 }else { 
				System.out.println("you should have studied harder");
			}
		
	}else { 
		System.out.println("U need to get a degree");
	}
		
	}

}