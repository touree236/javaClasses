package com.javaAndOrNot;

public class logeicNot {
	public static void main(String[] args) {
		
		//if name not Marry or Anna then you are not my sister
		
		String name="Mary";
	    String name2="Anna";
	    // true Or Flase --> ture add NOT --> false 
	    
	    if(!(name.equals("Mary")||name.equals("Anna"))) {
	    	System.out.println("You are not my sister");
	    }else { 
	    	System.out.println("You are my sister");
	    }
	    
	    
	    
	}
}
