package com.Class16;

public class Phone {

	/*
	 * create a class phone . create 3 objects of it : Iphone ,Andriod, Nokia with
	 * specific attributes and behaviours
	 */

	String smart, Games, name, brand;  // variables or attributes 
	int touchscreen, facetime, price;

	void Games() {
// method body
		System.out.println("i can play games on my " + name);  // behavior -methods 
	}

	void text() {
		System.out.println("i can text on my" + name);
	}

	void voice() {
		System.out.println("i have voice command on my" + name);

	}

	public static void main(String[] args) { // we use the main method to execute the code 

		Phone phone1 = new Phone(); // to create any object you need a class 
		phone1.brand = "Iphone";    
		phone1.name = "11";        
		phone1.price = 1300;

		System.out.println("I have " + phone1.brand + phone1.price);  
		phone1.text();
		phone1.Games();
		
		Phone phone2=new Phone();
		phone2.brand="Nokia";
		phone2.name="N300";
		phone2.price=600;
		System.out.println("I have " + phone2.brand + phone2.price);
		phone2.text();
		phone2.Games();
		
		Phone phone3=new Phone();
		phone3.brand="Android";
		phone3.name="K200";
		phone3.price=100;
		System.out.println("I have " + phone3.brand + phone3.price);
		phone3.text();
		phone3.Games();
		
	
     
	}
	
	
}
