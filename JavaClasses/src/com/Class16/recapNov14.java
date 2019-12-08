package com.Class16;

public class recapNov14 {

	void sum(int num1, int num2) {
		int c=num1+num2;
		System.out.println("The sum of2 number is ="+c);
		
	}
	
	/// create method to display hello 5 time 
	
	void sayHello(int times) {
		for (int i=0; i<times;i++) {
			System.out.println("Hello");
	
	
}
}
// create method to say something #  number of time 
	void saySomething(String word,int times) {
		for (int i=0; i<times;i++);
		System.out.println(word);

	}
	
	public static void main(String[] args) {
		recapNov14 obj=new recapNov14();
		obj.sum(10, 30);
		System.out.println("------------");
		obj.sayHello(1);
		obj.saySomething("Java",5);
		//obj.saySomething(5, "welcome")
		
		//we can call method we have to pass mathing arrgument 
		
	}	
	}
	
	