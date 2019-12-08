package com.class24;

public class Thiskeyword {
	int a,b;
	
	public Thiskeyword(int a,int b) {
		this.a=a;   // to differentiate between the instance variable and
		            // the local variable use this. keyword
		this.b=b;
	}
	
	
	
	public  void sum (int a,int b) {
System.out.println("The sum of local parameter is "+(a+b)); //to local varibale
System.out.println("The sum of instance parameter is "+(this.a+this.b)); // dont forget to concatinate
	}
	
	public static void main(String[] args) {
		
		Thiskeyword obj=new Thiskeyword(5, 10);
	 obj.sum(10,20);
		
	 Thiskeyword obj1=new Thiskeyword(5, 10);
	 obj1.sum(10,20);
		
	}
		
	}

