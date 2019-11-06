package com.class4;

import java.util.Scanner;

public class Task3 {
	
	
    public static void main(String[] args) {
    	
        Scanner scan=new Scanner(System.in);
         System.out.println(" Please enter the city ");
         String city=scan.nextLine();
         System.out.println(" Please enter the temperature in Fahrenheit");
         int Tem=scan.nextInt();
        
         System.out.println(" the tempeature of "+ city+" is "+ ((Tem-32)*5)/9);
		
	}

}
