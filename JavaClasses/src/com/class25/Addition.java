package com.class25;

public class Addition {    //  Ploymoprhism we strictly talk about methods  performing action in differnt ways 

	public void add ( int num1, int num2) {
		System.out.println(num1+num2);
	}
	public static void add(int num1,int num2, int num3) {
		System.out.println(num1+num2+num3);
	
	}
	
	public static void Addition(String[] args) {
	}
		static Addition obj=new Addition();
		obj.add(12,13);
		obj.add(12,13,14);
		
		
		// 2 types of Polymorphism - 1- compile time 2- runtime  ( method overloading)  
		// method overloading is having same method name within same class 
		// 1-you can achieve your method overloading is by passing different amount of parameters 
		// 2- or the second type is by having different type of parameters 
		public void add (double num1, double num2) {
			System.out.println(num1+num2);
		}
		public static void main(String[] args) {
			obj.add(12,13);
			obj.add(12,13,14);
			obj.add(12.09,12.10);
			
			String str="Hello";
			System.out.println(str.substring(3));
			System.out.println(str.substring(1,3));// same method performing different action 
		
	}
	
}
