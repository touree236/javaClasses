package com.class22;

public class Static {
	

		String name;   // these are instance variable 
		String lastName;
		
		// static variable like eyes , nose or common features 
		
		static  int eyes=2;
		static int nose=1;
		static boolean brain=true;
		
		public static void main(String[] args) {
			
		
		Static  human1=new Static ();
		human1.name= "John";
		human1.lastName="Smith";
		System.out.println(human1.eyes);
		System.out.println(human1.nose);
		System.out.println(brain);
	


		Human human2=new Human();
		human2.name= "John";
		human2.lastName="Smith";
		human2.lastName="Doe";
		
		System.out.println(human2.name);
		System.out.println(human2.lastName);
		
		}	

}
