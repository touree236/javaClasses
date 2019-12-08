package com.class27MethodOverriding;

public class RunTimePolymorphism {
	public static void main(String[] args) {
		
		// creating an obj on parent class
	Animal animal=new Animal();
		animal.sleep();
		animal.eat();
		
		//creating an obj of child class 
		Cat cat=new Cat(); // this will come from the child class 
		cat.eat(); // from Parent class
		cat.sleep();// from child
		cat.meow(); // from child
		
		// Widening
		double d=90; // how to put a smaller number into a bigger box
		
		// Narrowing 
		int i=(int)1.99;  // to change a double into an int you just put the (int) 
		
		// non primitive Typecasting
		//widening -> creating an object of the class and giving reference to the parent class
		Animal obj=new Cat();// the object is an animal type 
	  // Narrowing
		// Cat obj2=new Animal (): can not convert from animal to cat 
	   obj.eat();  // coming from parent 
	   obj.sleep();  // thismethod will come from the child class-> this step is what called RunTimePolymorphism
	   
	  //obj.meow (); compiler error --> method would not wont available
	}
	 
	

}
