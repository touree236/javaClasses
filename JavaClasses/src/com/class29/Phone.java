package com.class29;

public abstract class Phone {
	
	// implemented method 
	public void makeCall() {
		System.out.println("Make Call");
	}
	public void sendText() {
		System.out.println("send text");
	}
	// unimplemented methods
		public void takePictures() {
	}		public void playGames(){	
			
		}
			// abstract class that  definds with  abstract keyword 
		  // and it has implemented ( methods that have body)
		//  and unimplemented methods ( method that do not have body):
		
		//abstract - is non access modifier , 
		         //- is a key word that definds 
}

// concrete class .. will all implemented methods 

class iPhone extends Phone{ // must provide a complete implementation 
	@override
	public void takePicture() {
		System.out.println("Iphone takes pictures");
	}
	@override
	public void playGames() {
		System.out.println("play games on Iphone");
}
}