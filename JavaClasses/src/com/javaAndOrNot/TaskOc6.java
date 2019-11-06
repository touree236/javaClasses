package com.javaAndOrNot;

import java.util.Scanner;

public class TaskOc6 {
	public static void main(String[] args) {
		
	/*
	 * ask user to enter boolean value for sale 
	 * if no sale --> I am not shopping
	 * if sale --> check the prices if the item 
	 * basked on the amount we will have to calculate the price after discount 
	 * if price < 20 --> apply 10%
	 * if price between 20-100 -->20% 
	 * if between 100-500 -->30%
	 * anything --> 50%
	 * 
	 * after discont __ the price of the item reduce from  __to __ 
	 */
	
	     
        boolean sales=true;
        double price;
        double balance;
        double finalprice;
        Scanner scan=new Scanner(System.in);
        
        System.out.println("Do you have sale");
        
        sales=scan.nextBoolean();
        
        if (sales) {
            
            System.out.println("PLease enter your price");
            
            price=scan.nextDouble();
            
            if (price<20) {
                balance=price*0.10;
                finalprice=price-balance;
                
                
            }else if (price>=20 && price<=100) {
                
                balance=price*0.20;
                finalprice=price-balance;
            }else if (price>=100 && price<=5000) {
                balance=price*0.30;
                finalprice=price-balance;
            }else {
                balance=price*.50;
                finalprice=price-balance;
            }
            System.out.println("After the discount "+balance + " the price of the item redce from "+ price +"to "+finalprice);
            
            
            
            
        }else System.out.println("IM not shoping");
        
        
        
    }
}