package com.class28;


public class CarTest {
	public static void main(String[] args) {
		
		Tesla tesla = new Tesla();
		Tesla tesla1=new Tesla(true);// Or ( "Tesla","S4",true);
		tesla1.displayInfo();
		Tesla tesla2=new Tesla(false);
		tesla2.displayInfo();
		
		
	}
	public static void helloNam(String name) {//instead of hard coding we can past it as parameters
		System.out.println("Hello"+name);     //  which means you can make it String inside the parameter
	}
	
}
