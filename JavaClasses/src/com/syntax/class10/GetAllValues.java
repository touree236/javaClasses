package com.syntax.class10;

public class GetAllValues {
	public static void main(String[] args) {
		// I want to print all values from an array
		//when value is dog --> I love dogs 
	
	
	String [] animals= {"Cat","dog","cow","snake","elephant"};
	
for (int i=0;i<animals.length;i++) {
	
	if(animals[i].equals("dog")) {
		System.out.println("i love dogs");
	}else {
		System.out.println(animals[i]);
		
		
	}
	
}
	}
}