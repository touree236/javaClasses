package com.class27MethodOverriding;

import com.Class16.main;

public class Animal {
	
	public void sleep() { 
		System.out.println("Animal can sleep ");
	}

	public void eat() { 
		System.out.println("Animal eat ");

	}

}

class Cat extends Animal{  // child class 

	public void sleep() { 
		System.out.println("cat can seelp all day  ");
}

	public void meow() { 
		System.out.println("cat meow  ");
	}

	public void eatv() { 
		System.out.println("Cat eat when hungr ");
	}
}