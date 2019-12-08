package com.Class16;

public class HelloMethodsNov12 {
	

	void sayHello(String name) { // add the string name in () so every time you want 
		System.out.println("Hello Moe"+name);// something in java called paramter and its 
		                                // the value that we can pass to our method
	}

	public static void main(String[] args) {
		
	HelloMethodsNov12 obj=new HelloMethodsNov12();// this method creates a new object 
	obj.sayHello("Moe"); // leave the name here 
    obj.sayHello("Hatem");// this is a peramter method to keep reusing the name in case you 
                          // we want to keep printing like a 100 times 
    obj.sayHello("Hasan");
    
    obj.sayHelloDifferentLanguage("USA");
    obj.sayHelloDifferentLanguage("Russia");
    obj.sayHelloDifferentLanguage("Palestine");
   // obj.sayHelloDifferentLanguage(123); --> will get compile time error 
    
    obj.sayNameAndAge("Jack, 45");
    obj.sayNameAndAge("Olga, 50");
    obj.isSnowing(true);
    obj.isSnowing(false);
    
	}

	/*create a method that will say hello in different languages based 
	 * on the value that will be passed when user calls a method 
	 */
	
	void sayHelloDifferentLanguage(String country);

	switch(country.lowercase()) { // the counties below must be lower case 
	
	case"USA":// usa
	System.out.println("Hello");
	break;
	
	case"Russia":// russia
	System.out.println("Privet");
	break;
	
	case("Palestine"):
	System.out.println("Salam");
	break;
	
	default:
	System.out.println("I don't know how to say hello in your language");
	
	// Methods : 2 types 
			//built in - limited and we can't modify them
			// user defined - unlimited and we can modify 
			
			// methods:
			//with no Parameters 
			// With parameters
			
			
			// say name and age
	
			void sayNameAndAge(String name , int age) {
				System.out.println("My name is "+name+"and I am "+age+"years old");
			}
			
			// create a method that will check if its snowing 
			// if snow --> stay at home , otherwise go for a walk 
			
			void isSnowing (boolean isSnowing); // method header we have method name 
			// method body 
			if (isSnowing) {
				System.out.println("stay Home");
			}else {
				System.out.println("Go for a walk");
			}
		
		
}