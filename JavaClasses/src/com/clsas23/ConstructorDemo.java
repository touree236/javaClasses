package com.clsas23;

public class ConstructorDemo {
	
	//ConstructorDemo // when you don't create your constructor default creates one for us 
	
	// How to create a constructor
	//1- it should have exact name as your class name 
	//2- it can't have a return type , not even void.
	
	
	//how Constructor executed : everytime when we create an object we call a constructor and entire block of 
	//code inside the Constructor will be executed.  
	// constuctor is a special method and does not have a return type
	
	ConstructorDemo (){ // we built the Constructor.
	System.out.println("I am your constructor");   // non argument constructor 
	}
	
	ConstructorDemo (String str){ 
		System.out.println("I am your constructor with o1 parameter"+str); 
}
	ConstructorDemo (int num){ 
		System.out.println("I am your constructor with o1 parameter"+num); 	
	}
	
public static void main (String []args ) {
	
	ConstructorDemo obj=new ConstructorDemo();
	System.out.println("Code after creating an object");
	obj.hello();
	
	ConstructorDemo obj2=new ConstructorDemo("My Parameter");
	
}

// build one Constructor 
public void hello() {
	System.out.println("Hello Class");
	System.out.println("Hello Instructor");
}

}
