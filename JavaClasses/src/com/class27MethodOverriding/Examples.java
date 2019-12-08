package com.class27MethodOverriding;

public class Examples {
 //create a class name with different parameters
	
	public String helloName(String str) {
		return str; // whatever value  you give, give me a return 
	}
	
	public String helloName(String str, String str2) {
	return str+" "+str2; // concatinate and return the value 
	// overloading  same
	}
}
 class smallExample extends Examples {
	 public String helloNmaes(String str) {
		 
		 return "Hello "+str;
		 
	 }
	 
	
	}
	 
	 
	 
 }