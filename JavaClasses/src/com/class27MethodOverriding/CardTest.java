package com.class27MethodOverriding;

public class CardTest {
	public static void main(String[] args) {
		
//	// primitive 
//		int i=10;
		
//		// non primitive 
//		String str="Hello";
//		Scanner scan;
//		Mastercard mastercard;
		
	// take an object of the child class and give reference to the parent 	
		//  reference variable = object is created 
		
 Card card=new AX();// this is the object of the class 
		card.chargeInterest();
		card.creditLimit();
		
		Card card1=new MC();
		card1.creditLimit();
		
		Card card2= new Visa();
		card.creditLimit()
		
		// type []arrayname={};
		//type[] arrayName=new type[];
		int [] numArray= {10,12,13};
		 String [] stringArray= {"aa","bb"};
		 Card[] cardArray= {card, card1, card2};
		 Card[] cardArray1= {new Mc(),new Visa(), new AX()};
		 
	//	 cardArray[0] --> MC
	// cardArray[3] --> Discovery 
		// to use the inhance loop use (:) ... use the for loop below 
		 for (Card card: cardArray1) {    
         mycard.Creditlimit();
         
         // or 
         for int y=0; y<cardArray.length;y++){
        	 cardArray1[y].creditLimit();
        	 
         }

		
		
	}

	
	
	
	

}
