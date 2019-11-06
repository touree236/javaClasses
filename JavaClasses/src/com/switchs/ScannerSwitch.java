package com.switchs;

import java.util.Scanner;

public class ScannerSwitch {
	
	public static void main(String[] args) {
		
		/*
		 * ask user where the are from
		 * based on the country we will specify favorite food
		 */
		
		String country;Object foodName;
		
		
		Scanner scan;
		scan=new Scanner(System.in);
		System.out.println("Please enter your country");
		country=scan.nextLine();
		
		switch(country) {
		
		case"Turkey":
		foodName="Kebab";
		break;
		
		case "Ethiopia":
		foodName="Tibs";
		break; 
		
		case "Paki":
		foodName="Beryani";
		break; 
		
		case "Russia":
		foodName="Caviar";
		break; 
		
		case "palestin":
		foodName="Hummous";
		break; 
		
		default :
			foodName= "Unknown"; 
		}
			
	System.out.println("You are from"+country +"and your favorite food is" + foodName);
	}

	
		
		
	}



