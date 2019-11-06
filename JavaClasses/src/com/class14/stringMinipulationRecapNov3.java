package com.class14;

public class stringMinipulationRecapNov3 {
	public static void main(String[] args) {
		
		// string is an object and its is a secquence of character, and it is  java class 
		//diffenssion of object - anything that has a state , like a car , keys phones etc .. 
		// also, they 
		
		
		// .replace
	
		String str="Syntax Technologies. is your place to study";
		System.out.println(str.replace('y' ,'i'));
		System.out.println("******************");
		
		System.out.println(str.replace("your","My"));
		System.out.println("******************");
		
		// regular experession is a sequance of charaters or AKA Regex (in short) is an API for defining String
		//patterns that can be used for searching, manipulating and editing a text. 
		//It is widely used to define constraint on strings such as password. 
		//Regular Expressions are provided under java.util.regex package
		
		//replaceAll
		
		String str2=" Vedio provieds a pwerfull way to help you prove your point.when you chlick Oline Vedio, You can paste";
		System.out.println(str2.replaceAll("[0-9]", ""));
		System.out.println(str2.replaceAll("[^A-Z]", ""));// ^ this means not to 
		System.out.println("******************");
		
		
		//Replace First 
		System.out.println(str2.replaceFirst("A", "")); // remove the first A in the sentance 
		
		
		
	}

}
