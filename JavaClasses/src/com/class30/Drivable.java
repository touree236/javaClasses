package com.class30;

public interface Drivable {
	// Interface is like a class but with unimplemented methods 
	
	// public static final constant variables 
	boolean DRIVE_FAST=true; // constant variables are written using upper case

	// by default complier will add public abstract abstract to the methods
	 void drive();
}
class Cars{
public void stop() {
	System.out.println("Car stops by pressing breaks");
}
	
}

class Toyota implements Drivable{
	@Override 
	public void drive() {
		System.out.println("Toyota can drive");
		
	}

	public void stop() {
		// TODO Auto-generated method stub
		
	}
}