package com.syntax.class10;

public class revresArrayOct23 {
	
	// ReverseArray 
	
	    public static void main(String[] args) {
//	      String[] animals = { "dog", "cat", "mouse", "bird", "donkey", "horse" };// if you want to use more strings 
	    	
	        String[] animals = { "dog", "cat", "bird" };
	        
	        for (int i = 0; i < animals.length; i++) {
	            System.out.println(animals[i]);
	        }
	        System.out.println("---Reverse---");    
	        for (int i = animals.length - 1; i >= 0; i--) {  // for the reverse start at -1
	        	
	            System.out.println(animals[i]);
	        }
	    }
	
	

}
