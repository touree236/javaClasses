package com.syntax.class2review;

import java.util.Scanner;

public class breakAndcontTask2 {
	
	public static void main(String[] args) {
		
		// create a program that will be asking User to apply for a cr card 10 times 
		// as soon you get "yes " from a user program should stop asking 
		
		Scanner scan=new Scanner(System.in);
		String card;
	
		for (int i=1; i<20; i++) {
			System.out.println("are you applyting to cr card?");
			card =scan.nextLine();
			if (card.equals("Yes")) {
				break;
			}
		}
	}
}
////// Nested if -->inside another if 
////   nested loops -->