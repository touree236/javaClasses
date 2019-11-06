package com.class4;

public class Mortgage {
	
	
	public static void main(String[] args) {
		
		
		
	double rate= 5.5; 
		double price= 4000000;
		
		if(rate>=4.5) {
			System.out.println("will not buy house");
		}else {
			System.out.println("will buy house ");
			
			if(price>200000) {
				System.out.println("will take a loan ");
		}else { 
			System.out.println(" will pay cash");
		}
		
	}
	}
}
