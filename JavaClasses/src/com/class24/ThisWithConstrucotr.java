package com.class24;

public class ThisWithConstrucotr {
	
	ThisWithConstrucotr(){
		System.out.println("Iam non argument constructor");
	}
	ThisWithConstrucotr(String Str){
		this();// this to call current class constructor 
		System.out.println("Iam constructor with 1 String paramerter");
	}
	ThisWithConstrucotr(String str, String Str1){ 
		this("Hello");
		System.out.println("I am construcotr with 2 params");
}
	public static void main(String[] args) {
		ThisWithConstrucotr obj=new ThisWithConstrucotr("Hello"); 
		// can you execute 2 constructor when creating an object 
		// yes- it can be achieved using this()
		// this type of constructor calls is know as COnstroctor Changing 
		ThisWithConstrucotr obj1=new ThisWithConstrucotr("Hello","Bye");
	}
}
