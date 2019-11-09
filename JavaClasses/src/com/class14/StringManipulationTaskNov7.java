package com.class14;

import java.util.Scanner;

public class StringManipulationTaskNov7 {   // recap with Asel Nov 7
	
	 public static void main(String[] args) {
	        //get a character at specific location
	        String str="Syntax Technologies Inc";
	        
	        char letter=str.charAt(5);
	        System.out.println(letter);
	        //length =19
	        //System.out.println(str.charAt(str.length()));//StringIndexOutOfBoundsException
	        System.out.println(str.charAt(str.length()-1));
	        
	        //get a substring from a String
	        //Syntax
	        String substr1=str.substring(0, 6);
	        System.out.println(substr1);
	        
	        //Technologies Inc  // how to print after 
	        String substr2=str.substring(7);
	        System.out.println(substr2);
	        
	        //replace
	        String str2="Java classes at Syntax are awesome";
	        str=str.replace("awesome", "great");
	        System.out.println(str2);
	        str=str.replace("a", "1234  68%&&  %%%");
	        System.out.println(str2);
	        
	        //replaceAll --> specify regular expression
	        //lets remove all special characters
	        str=str.replaceAll("[^A-Za-z0-9]", "");
	        System.out.println(str);
	        
	        //split
	        String myString="Java classes at Syntax are awesome";
	        String[] array=myString.split("a");
	        System.out.println(array.length);

	        
	        
	        
	 

	
	
	
	
}
}
