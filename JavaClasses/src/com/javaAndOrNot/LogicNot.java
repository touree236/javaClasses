package com.javaAndOrNot;

public class LogicNot {
	
	public static void main(String[] args) {
		
		boolean b1=!true;
		boolean b2=!false;
		
		System.out.println("b1");
		System.out.println("b2");
		
		boolean traffic=true;
		//if traffic-->late , else--> on time 
		if (!traffic) {// using !we are reverting condition
			System.out.println("On time ");
		}else { 
			System.out.println("late");
			
			boolean isRain=false;
			if (!isRain) {
				System.out.println("take and Umbreall");
			} else {
				System.out.println("dont take ");
			}
		}
	
			// let's compare2 number using not operator
		
		int num1=10;
		int num2=11;
		
		if (num1==num2) {
			System.out.println("numbers are equal");
		}else {
			System.out.println("Number are not equal");
		
		
		if (!(num1==num2)) {// we are reverting true to false 
			System.out.println("Numbers are not equal");
		}else { 
			System.out.println("Numbers are equal ");
		}
		}
}
