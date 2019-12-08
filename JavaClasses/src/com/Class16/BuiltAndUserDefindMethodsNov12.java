package com.Class16;

import java.util.Scanner;

public class BuiltAndUserDefindMethodsNov12 {  // they are called built in 
	
	public static void main(String[]args) {
		
	String str="Hello";
	str.replace("Hello","Hi");
	System.out.println(str);
	
		Scanner scan=new Scanner(System.in);
		scan.nextLine();
		
		BuiltAndUserDefindMethodsNov12 obj=new BuiltAndUserDefindMethodsNov12();
		obj.MyMethod();
	}
		void MyMethod() {// method header
			// the sysout part  
			System.out.println("This is user defined method that I created");
		}
		
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
		
		
		
		
}
