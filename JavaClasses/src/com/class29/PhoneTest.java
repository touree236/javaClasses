package com.class29;



public class PhoneTest {
	
	public static void main(String[] args) {
		
		// you can't create an object of an abstract class 
		// Phone phone=new phone (). can't instanciate 
		
		
		// we can create a child class in an indirectly
		 Phone phone=new iPhone();
		 phone.makeCall();
		 phone.sendText();
		 phone.takePictures();
		
		
	}

}
