package com.javaAndOrNot;

public class Not {
	public static void main(String[] args) {
		
		
		String weekDay="sunday";
		if (weekDay.equals("Tuesday") || weekDay.equals( "Thusday")) {
		System.out.println("SDLC class");
	} else if (weekDay.equals("Satruday")||weekDay.equals("Sunday")) {
	System.out.println("Java Class");
	}else if( weekDay.equals("Monday")||weekDay.contentEquals("Friday")){
		System.out.println("No Class");
	}else if (weekDay.equals("Wednesday")) {
		System.out.println("Review class");
	}else {
		System.out.println("Not a valid day");
	}
		
		
	}

}
