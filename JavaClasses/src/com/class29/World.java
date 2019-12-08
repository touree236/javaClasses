package com.class29;

public class World {
	
	
	​
	
		private static final String Ela = null;

		public static void main(String[] args) {
			Human person1 = new Human("Andrei");
			Human person2 = new Human("Salim", 25, 150);
			
			System.out.println("---America---");
			Human person3 = new American("John", 42, 250, "111-22-333");
			
			System.out.println("---Albania---");
			Human person4 = new Albanian(Ela, 35, 140,"Bb1k11-111");
			
			System.out.println();
			System.out.println("The world ended!!!");
		}
	​


}
