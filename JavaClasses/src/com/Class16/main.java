package com.Class16;

public class main {
	
	
//	Create a Class Main that should be a template for the DogClass. 
//	In this class, you should specify the following attributes: breed, name, color,
	//and following behaviors: bark(), run(), play().
//	Create 3 different objects of it: Husky, Bulldog, Labrador with 
	//specific attributes and behaviors.
//
//	The output of the program should be as following:
//	 
//	Husky can bark
//	Husky can run
//	Husky can play
//	Bulldog can bark
//	Bulldog can run
//	Bulldog can play
//	Labrador can bark
//	Labrador can run
//	Labrador can play

	String breed,name,color;
	  int  type;
	   void bark() {
	       System.out.print("My Dog type is "+type+"can bark");
	   }
	    void run() {
	       System.out.println("My Dog type is "+type+"can run");
	   }
	    void play() {
	       System.out.println("My Dog type is "+type+"can play");
	   }
	   public static void main(String[] args) {
	       main dog1=new main();
	       dog1.type="Husky";
	       main dog2=new main();
	       dog2.type="Bulldog";
	       main dog3=new main();
	       dog3.type="Labrador";
	       System.out.println(dog1.type+" can bark \n"+dog1.type+" can run \n"+dog1.type+" can play ");
	       System.out.println(dog2.type+" can bark \n"+dog2.type+" can run \n"+dog2.type+" can play ");
	       System.out.println(dog3.type+" can bark \n"+dog3.type+" can run \n"+dog3.type+" can play ");
	   }
	}
