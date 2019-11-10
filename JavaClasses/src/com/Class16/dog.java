package com.Class16;

public class dog {
	
	
	  int age, tall, weight;
	    String color, eye, type;  // hatem's way 
	    
	    void runFast() {
	        
	        System.out.println("My Dog type is "+type+"and he is runing so fast");
	    }
	    
	    public static void main(String[] args) {
	    	// fn f3 will take you to the method 
	        
	        dog Husky=new dog();
	        Husky.type="K9";
	        Husky.color="white";
	        Husky.eye="Black";
	        Husky.age=3;
	        Husky.tall=2;
	        
	        Husky.runFast();
	        
	        System.out.println("The type of my dog is "+ Husky.type+" and his color is "+Husky.color+" and his eye color is "+ Husky.eye);
	        
	        
	    }
	    
	}

