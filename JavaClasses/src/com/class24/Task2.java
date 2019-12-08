package com.class24;

public class Task2 {
	
	/*
	*  Task #2 write program that have static constructor and observe restult
	*/
	// can't make your constructor static. 

	public static void main (String [] args) {
		Task obj=new Task();
		Task obj1=new Task(4);
		//Task obj2=new Task(4,5);// it gives an error since your protected
		Task obj3=new Task("some string");
	
	
}
}