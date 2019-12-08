package com.class22;

public class AcessingStaticVariables {
	
	public static void main(String[] args) {
		
		husky obj=new husky();// you can access the class through creating an object 
		System.out.println(obj.name); // will get this from the husky class
		obj.name="Shrik";
		System.out.println(obj.name);
		
		husky.breed="New Breed";
	System.out.println(husky.breed); // possible but not preffeable 

	}

}
