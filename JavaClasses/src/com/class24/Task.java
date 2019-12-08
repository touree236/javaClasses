package com.class24;

import com.class22.Static;

public class Task {
	
	/*
	 *  write a program that will have constructor class and create 2 objects of this class :
	 *  1- inside same class : 
	*    2-from outside the class and observe result
	*  3- from a different package.
	*/
	
	
	
	public Task() {
		System.out.println("I am public constructor");
	}
	
	Task(String str){
		System.out.println("I am default constructor");
	}
	protected Task (int num) {
		System.out.println("I am protected constructor");
	}
	private Task(int num, int num2) {
	System.out.println("I am protected constructor");
}
	
	public static void main (String [] args) {
		Task obj=new Task();
		Task obj1=new Task(4);
		Task obj2=new Task(4,5);
		Task obj3=new Task("some string");
	}
	
	
}
	
	


