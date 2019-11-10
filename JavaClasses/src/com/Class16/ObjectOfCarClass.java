package com.Class16;

public class ObjectOfCarClass {
public static void main(String[] args) {
	// to create an object synatx is
	//ClassName Variable=new ClassName();
	//Scanner scan=new=Scanner(System);
	//String str=new String();
	
	Car car1=new Car();
    car1.make="Tesla";
	  car1.model="S";
    car1.year=2020;
    car1.color="Black";
    car1.wheels=4;
	  car1.windows=5;
			
	  
	  
	  
	  System.out.println("-----------------");
	  
	     Car car2=new Car();
	     car2.make="BMW";
		  car2.model="i8";
	      car2.year=2019;
	      car2.color="Green";
	      car2.wheels=4;
		  car2.windows=6;
		  
		  // accessing behavior for 2nd object which is car2
		  
		car2.drive();  // calling method from this class 
		car2.start();
		car2.accelerate();
	
		// Print features of the car
		 // I have black Tesla
		  
  System.out.println("I have "+car1.color+" "+car1.make);
	
  System.out.println("I have "+car2.color+" "+car2.make);

	
  System.out.println("I have "+car1.color+" "+car1.make);
	
	
	
	
	
	
	
}
}
