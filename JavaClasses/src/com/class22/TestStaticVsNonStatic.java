package com.class22;

public class TestStaticVsNonStatic {

	public static void main(String[] args) {
		
		/*how to access static numbers 
		 * they can be accessed by className in which they defined
		 */

		System.out.println(StaticVsnonStatic .school);// access variables 
		StaticVsnonStatic.getInfo1();                 // access methods 
		
		/* how to acess non static numbers 
		 * they can be accessed by creating an object of the class 
		 */
		
		StaticVsnonStatic  obj=new StaticVsnonStatic ();
		obj.name="John";
		obj.grade='A';
		obj.getInfo();
		
		// Modifier in Java 
		// 1- access Modifiers -> applicable for variables , methods, constructor or class
		 //private 
		//default 
		// protected 
		// -public -making variables access to the entire project 
		
		// SYNTAX for Variables 
		//   optional  
		//  to add restrictions you have to add access modifier non access  
		//static dataType variables // 
		
		// SYNTAX fir methods 
		//   also optional must must 
		// static returnType methodName 
		
	}

}
