package com.javaAndOrNot;

public class timeOfday {
	public static void main(String[] args) {
		
		/* Write a program that will read three inputs of scores 
		 
		if the time of day 1-11 --> Morning 
		if the time of day 12-15 -->  Noon
		if the time of day 16-20 --> Evening
	    if the time of day >20 --> Night
		*/
		

			timeOfday="Morning";
		}else if (time >=12 && time <=15) {
			timeOfday="Noon";
		}else if (time >=16 && time <=20) {
				timeOfday="Evening";
		}else if (time >20) {

			
			timeOfday="Night";
		}else {
			timeOfday ="Invalid";
	}
		System.out.println("Time of the day is " +timeOfday);	
		
		if (timeOfday.equals("Morning" )) {
			System.out.println(" Good morning");
			
		}
		
	}

}
