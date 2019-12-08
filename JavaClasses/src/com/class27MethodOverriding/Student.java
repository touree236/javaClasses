package com.class27MethodOverriding;


	// Crate a class student that will have 3 subclasses as Syntax
	// college student , school student .
    // Define common behavior within parent class and override
	//some of the methods in child classes .
	 // Define some methods specific to chlid classes 
	// write example of acheiving run time polymorphism

	
	public class Student {
		public void study() {
			System.out.println("Studend to Study");
			
		}
		
		public void doHomework() {
			System.out.println("Studend to homework");
		}
		
		public void research() {
			System.out.println("Studend to research");
		}
			public void attendClasses() {
				System.out.println("Studend to attend Classes");
				
			}

			public void attend() {
				// TODO Auto-generated method stub
				
			}}

class SyntaxStudent extends Student{
	
	public void study() {
		System.out.println("Syntax needs to study");
				
			}}

class collegestudent extends Student{
	public void research() {
		System.out.println("college students needs to research");
	}}
		
		
class school extends Student{
	public void attend() {
		System.out.println("Syntax needs to attend");
	}}


		
		
		
		
		