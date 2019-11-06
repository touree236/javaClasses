package com.syntax.class2review;

import java.util.Scanner;

public class betterCalculator {  // dinamic calulator
	
	public static void main(String[] args) {
	//	int a=10;
	  //  int b=12;
	   // String name1="John";
	 //   String name2="Smith";
	//    System.out.println(name1.equals(name2));  // make sure to put the dot equal ( how work question) 
	//System.out.println(a==b);
	
	// in Sacnner no need to write the code above
		// codding starts below 
		
		Scanner sacn=new Scanner(System.in);
		System.out.println("Enter in First Numebr");
		int num1=sacn.nextInt();
		System.out.println("Enter in Operator");
		String operator=sacn.next();
		System.out.println("Enter in Second Numebr");
		int num2=sacn.nextInt();
		// now we can use the ifstatment
		
	if (operator.equals("+")){
		System.out.println(num1+num2);
	}else if (operator.equals("-")){
		System.out.println(num1-num2);
	}else if (operator.equals("/")){
		System.out.println(num1/num2);
	}else if (operator.equals("*")){
		System.out.println(num1*num2);
	} else {
		System.out.println("invalid Operator or number entered");
	//	scan.close(); // once you type scan.close you can't type anything after it 
		
	}
				
	}

}
