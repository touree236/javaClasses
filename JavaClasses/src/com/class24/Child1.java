package com.class24;

public class Child1 extends parents{
	
	public void code() {
		System.out.println("I can code");
		
		
		
		Child1 child1=new Child1(); 
	  System.out.println(Child1.race);// we call it by the class name since its static 
	  System.out.println(child1.hairColor);
	  System.out.println(child1.eyeColor);
	  child1.sing();
	  child1.code();
	  
	  parents parents=new parents();
	  System.out.println(parents.hairColor);
	  System.out.println(parents.eyeColor);
	  
	}
	

}
