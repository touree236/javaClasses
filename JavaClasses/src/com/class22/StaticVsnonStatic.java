package com.class22;

public class StaticVsnonStatic {
	
// Static is a keyword 
// static keyword can be used with variables methods and blocks and nested classes 
// static belongs to the class 
	// static methods can access all static varibales but can't access instance varibale  
	
	//template for a student (school, name , grade) 
	
	static String school="Syntax";  // this is a static varibale 
	
	String name; // instance variables
	char grade;
	
	void getInfo() {
		System.out.println("My name is "+name+"and I amn going to "+school+
				"and my grade is ");
	}
	// static method 
	
	 static void getInfo1() {
		System.out.println("I am attending claess at"+ school);
		
	 }
	 // accessing static meembers within same class 
	 //--> just use name for a varible 
	 // or call method by its name only 
	 public static void main(String[]args) {
		 System.out.println(school);
		 getInfo1();
}
}