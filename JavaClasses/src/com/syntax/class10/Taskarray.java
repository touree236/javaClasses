package com.syntax.class10;

public class Taskarray {
	// using switch 
	public static void main(String[] args) {
	

	String [] country= {"USA","Jordan","Iraq","Turky","Lebanon"};
    for(int i=0;i<country.length;i++) {
    	switch( country[i]) {
    	
    	case "USA":
    	System.out.println("Washington DC");
    	break; 
    	case "Jordan":
    	System.out.println("Amman");
    	break; 
    	case "Iraq":
    	System.out.println("Bagdad");
    	break; 
    	case "Turky":
    	System.out.println("Ankara");
    	break; 
    	case "Lebanon":
    	System.out.println("Beyrout");
    	break; 
    	default:
    	System.out.println("unknow");
    	
    	
    	}
    	
    	
    	
    	
    }

}
}