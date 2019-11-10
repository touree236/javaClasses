package com.Class16;

public class ObjectOfComputerClass {
	
	public static void main(String[] args) {
		
		// to create an object synatx is
		//ClassName Variable=new ClassName();
		//Scanner scan=new=Scanner(System);
		//String str=new String();
		
		
		ComputerClass comp1=new ComputerClass();
		
		comp1.brand="Apple";
		comp1.keyborad="true";
		comp1.screen=15;
		comp1.memory=250; 
		
		System.out.println("I want to buy an Apple computer with"+ comp1.screen+" "+ comp1.brand);
		
		
	
		}
		 
}
