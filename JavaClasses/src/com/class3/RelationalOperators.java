package com.class3;

public class RelationalOperators {

	public static void main(String[] args) {
		
		 int num1=20;
	        int num2=19;
	        
	        System.out.println(num1>num2);
	        System.out.println(num1<num2);
	        
	        //Relational & Equality Operation < >
	        
	        System.out.println("*****************");
	        
	        
	        
	        double d=1.99;
	        double d1=2.99;
	        
	        boolean b1=d<d1;
	        boolean b2=d==d1;
	        boolean b3=d!=d1;
	        
	        System.out.println(b1);
	        
	        System.out.println(b2);
	        System.out.println(b3);
	        
	        System.out.println("*****************");
	        
	        int a=90;
	        int b=30;
	        
	        //if number a is bigger than number b
	        //i want to print a is larger than b
	        
	        if (a>b) {
	            
	            System.out.println("a is larger than b");
	            // else means otherwise
	        }else { 
	        	System.out.println("a is smaller than b");
	        }	
	        	 int expetedHouers=15;
	             int actualHours=2;
	         
	             if(actualHours>expetedHouers) {
	                 
	                 System.out.println("you will succeed");
	                 
	                 
	             }
	             else {
	                 
	                 System.out.println("you will fail");
	             }
	             
	           
	             
	             double teaPrice=4.99;
	             double allowedPrice=3.99;
	             
	             
	             teaPrice-=2;
	             
	             if (teaPrice>=allowedPrice) {
	                 
	                 System.out.println("dont Buy");
	                 System.out.println("And i will enjoy my tea ");
	             }else {
	                 
	                 System.out.println("You can buy");
	                 System.out.println("next time");
	             }
	           
	         
	
	}
	}




	