package com.syntax.class2review;
	
	import java.util.Scanner; 
	class Main {
	}
public class assigNum36 {

	  public static void main(String[] args) {
		
	
	  
	  Boolean thirsty;
	  Boolean sleepy;
	  
	  
	  Scanner scan=new Scanner(System.in); 
	  
	   System.out.println("Are you thirsty?");
	   thirsty=scan.nextBoolean();
	   
	   System.out.println("Are you Sleepy");
       sleepy=scan.nextBoolean();
       
       if (thirsty && !(sleepy)) {
    	   System.out.println("Looks like you need to drink Water");
       } else if (thirsty && sleepy) {
    	   System.out.println("Looks like you need drink Coffee");
       }else if (!(thirsty && sleepy)) {
    	   System.out.println("Looks like you need drink Tea");
       }else {
    	   System.out.println("Looks like you need Nothing");
       }
       
}
}