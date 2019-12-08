package com.class22;

public class InstanceVariable {
	String name="Samir";
	
	public static void main(String[] args) {
		
		
		String name="Burcu";   // Burcu is a local vaiable 
		System.out.println(name);
		
		InstanceVariable obj=new InstanceVariable();
		System.out.println(obj.name);
		// changing the value of the instance variable
		// Instance varibale always in side the class and out side the method 
		// when we crate an instance of the class ( object of the class) copy of each 
		//instanc evaribales will be given to each object(instance); 
		obj.name="John";
		System.out.println(obj.name); 
		
		// value will be Samir 
		InstanceVariable obj1=new InstanceVariable();
		System.out.println(obj1.name);// every time you create a new object,you can change the value in the method 
	}

}
