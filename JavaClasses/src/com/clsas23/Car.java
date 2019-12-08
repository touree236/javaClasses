package com.clsas23;


	
//	Car car1 = new Car ();
//	Car -Class Name 
//	car1- object reference variable 
//	= - assigning operator 
//	new - Keyword used to create an object 
//	Car()- constructor 
// ; end of statement 
//Constructor - Special method / block of code that is being executed 
//when we create an object / an instance of the class. 
// Constructor always be named as the class name and does not have a return type. 
//  interview question whey we need constructor can intilaize instance variables
	
	public class Car {
		/* we want to build make as Toyota that will have different models and color *
		 */

		public static String make;
		public String model;
		public String color;
		public int speed;
		public int doors;

		public void getDetails() {
			System.out.println("I build " + color + " " + make + " " + model);
			System.out.println("My car has "+doors+" doors and can have speed up to "+speed );
		}
	}
	
	
	