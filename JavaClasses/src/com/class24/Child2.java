package com.class24;



	public class Child2 extends parents{
		
	

		public void dance() {
			System.out.println("I can dance");
			
			
			Child2 child2=new Child2(); 
			  System.out.println(Child2.race);// we call it by the class name since its static 
			  System.out.println(child2.hairColor);
			  System.out.println(child2.eyeColor);
			  
			  
			  child2.dance();
			  
		}
	
		
	}
