package com.class28;

public class Car {

	String make,model;
	
	Car(){
		System.out.println("I am non argument constructor");
	}
    Car(String make, String model){
    	this.make=make;
    	this.model=model;
    }
	}
	
	class Tesla extends Car{
		boolean autopilot;
		
		Tesla(){
		//super();// compiler will add by default to make a call super class 
		         // constructor to initialize and object   
		System.out.println("I am a non argument constructor");
		}
		Tesla (boolean autopilot){ 
			super("Tesla","S5");// (make,model) buy constrctor call //passing the value .. instead of hard coding 
		this.autopilot=autopilot;
		}
		public void displayInfo() {
			System.out.println("Car"+make+" "+model+" "+"has an autopilot");
    	
		
    
	}
}
