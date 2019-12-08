package com.class22;

public class husky {
static String breed="husky";  
static int paws=4;
static int tale=1;

String name;
String color;

void display() {
	System.out.println("Puppy name is"+name+"and it is reed is "+breed);
}

public static void main(String[] args) {
	
	husky puppy1=new husky();
	husky puppy2=new husky();
	
	puppy1.name="Meatball"; // all the varibales will be going back to the main class
	puppy1.color="Brown";
	puppy1.display();
	puppy2.name="Shrik";
	puppy2.color="Black";
	puppy2.display();
	
	System.out.println("Changing Breed");
	
	husky puppy3=new husky();
	puppy3.name="Jack";
	puppy3.color="";
    breed="Bulldog";
	puppy3.display();
	// displaying value from previous instance
	puppy1.display();
	puppy2.display();
	
	
	
}

}
