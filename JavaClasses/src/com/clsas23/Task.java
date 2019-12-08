package com.clsas23;

public class Task {
	
	 /*  tasl 1 Write a program that will have a constructor: one with parameters and second 
	 * without any parameters. Create a separate Test class where you will execute 
	 * both of the constructors.
     */
	
	Task (){ 
		
	
		public static String Task;
		public String name;
		public int age;
		
		Task.name="Moe";
		Task task1=new Task();
		Task.age="33";
		task1.getDetails();
		
public void getDetails() {
			System.out.println("My Name is  " + name + "and age is " + age);
	
}
	
}
