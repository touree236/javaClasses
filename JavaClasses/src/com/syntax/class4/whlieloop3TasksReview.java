package com.syntax.class4;

import java.util.Scanner;



public class whlieloop3TasksReview {
	public static void main(String[] args) {
		
	
	
	  //	Task One	
			/* print only even numbers from 1 to 20 */
	int i=1;
		while (i <=20) {// while condition is true
			if (i%2==0) {
		System.out.println(i);
		i++;
		}
	}
	

		//Task Two
		/* how to print numbers from 5 to 25 inclusive all in 1 line with space in
		 *  between?
		 */
		
	
		int a=5;
		while(a <=25) {
		System.out.println(i+" ");
		a++;
		
		
		    /*
	        //Task Three 
			/Prompt the user to ask the name 3 times and print "Hello____" 
			 * */
		
        Scanner Scan=new Scanner(System.in);
	    String name;
		System.out.println("Print your name");
		name=Scan.nextLine();
		int c=1;
		while ( c<=3) {
		System.out.println("Hello"+name);
		c++;
	
	
	}	
	}

	}
