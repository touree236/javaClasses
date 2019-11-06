package com.javaAndOrNot;

public class timeOfdaynull {
	

	public static void main(String[] args) {
		
		/* Write a program that will read three inputs of scores 
		 
		if the time of day 1-11 --> Morning 
		if the time of day 12-15 -->  Noon
		if the time of day 16-20 --> Evening
	    if the time of day >20 --> Night
		*/
		
		
		//In Java All local variables MUST be initialized before using then!!!!
		//Default value of : 
	//	Int → 0 
	//	Double → 0.0 
	//	Boolean → false 
	//	String → Null  

		int time=10;
		String timeOfday= null
		if (time >=1 && time <=11) {
			timeOfday="Morning";
		}else if (time >=12 && time <=15) {
			timeOfday="Noon";
		}else if (time >=16 && time <=20) {
				timeOfday="Evening";
		}else if (time >20) {
					timeOfday="Night";
		}else {
			System.out.println("Your entery is nvald");
			timeOfday ="Invalid";
	}
		System.out.println("Time of the day is " +timeOfday);	
		
		
	}

}

