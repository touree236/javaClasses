package com.class4;

import java.util.Scanner;

public class TaskScanner {
	
	public static void main(String[] args) {
	
	Scanner keyboard=new Scanner(System.in);// remeber this line 
	
	//You are a loan specialist and you need to ask user 
	//what is the amount of loan is needed. If loan is less than 200,000 
	//then you would lend the money otherwise you would reject the client.
		
int amount= 200000;

	int num2=keyboard.nextInt();
	
	if (num1> num2){
	

		if (amount>200000) {
		
			System.out.println("will lean the $");
			
		 }else { 
				System.out.println("reject the client");
			}
		
		
		}
	}