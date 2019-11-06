package com.class4;

public class NestedIfmore {
	public static void main(String[] args) {
		/* check age ,if ages is less than 16--> you are too young to drive 
		 * otherwise --> you are eligible to drive and we will check 
		 * if you are older than 18-->
		 * you can get drivers license and if not you can get learners permit 
		 */
		
		int age=18;
				
				if (age<16) {
					System.out.println("you are too young to drive");
				}else {
					System.out.println("you r eligible to drive");
					
					if (age>=18){
					System.out.println("You can drive alone");
					}else {
					System.out.println("you need your parents to drive");
					
				}
				}
	
				
				System.out.println("-------------------");
				/* we need to check if student completed the quiz
				 * if yes -->good job;if not --> not good 
				 * if they completed we will check the score:
				 * if more than 90--> you got an A
				 * if more than 80 --> you got a B 
				 * anything below you should study more */
				
				boolean quiz= true;
				int score =89;
			
				if (quiz) {
					System.out.println("good job!!!");
					
					if (score>=90) {
						System.out.println("U got A");
					}else if ( score >80) {
						System.out.println("u got B");
					}else 
						System.out.println("study more");
				}else {
					System.out.println("Not good!!!");
				}
				
				
				
				
				 
				
	}

}
