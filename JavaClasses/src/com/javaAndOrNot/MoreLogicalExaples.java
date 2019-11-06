package com.javaAndOrNot;

import java.util.Scanner;

// to import short cut is ctr+shift+O--> windows 
// foor mac camand+shit=O 
public class MoreLogicalExaples {
	private static double commission;

	public static void main(String[] args) {
		
		
		/* ask user to enter daily sales
		 * based on the sales range we wan to give commission to the person
		 * if sale is < less than 100 --> commission is 10%
		 * if sales is between 100-200 --> commmission 20%
		 */
		
		Scanner scan;
		double salesAmount;
		double comission;
		
		Scanner scan1=new Scanner(System.in);
		System.out.println("Please enter  your sales amount");
		salesAmount=scan1.nextDouble();
		
		if (salesAmount<100) {
			//lets give user 10% commission of sales
			// perform some apporation 
			
			commission=salesAmount*0.1;
		}else if (salesAmount >=100 &&salesAmount<200) {
			// lets give user 20% commission of a sale 
			commission=salesAmount*0.2;
		}else if ( salesAmount >=200 &&salesAmount<500) {
			//lets give user 30% if commission sales 
			commission=salesAmount*0.3;
		}else if ( salesAmount >=500 &&salesAmount<200) {
			//lets give user 50% of sales
			commission=salesAmount*0.5;
		}else {
			commission =0;}
		System.out.println("Based on your sales your commission"+ commission);
			
		}
		
	}


