package com.class4;

public class IfElseRecap {
	public static void main (String[] args) {
		
		/* Class schedule
		 * if tuesday --> sdlc
		 * if wedenday --> jave review
		 * if turdsay--> sdlc 
		 * if saturday --> java coding
		 * if sunday --> my favorite jave coding 
		 */
		
		int day=3;
		
		if (day==1) {
            System.out.println("SDLC CLASS");
        }
        else if (day== 3) {
            System.out.println("Review class");
        }
        else if (day== 4) {
            System.out.println("Sdlc class");
        } else if (day == 6) {
            System.out.println("Java Class");
        } else if (day == 7) {
            System.out.println("My favorite Java coding");
        } else {
            System.out.println(" there is no class at school");
        }
    }
}
