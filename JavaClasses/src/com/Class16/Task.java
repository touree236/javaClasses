package com.Class16;

public class Task {
	

		
 //1.  create a method that will take 2 parameters as numbers and prints 
//   which number is larger	
//2. create a method that will take a number and prints whether the number is even or odd
//3. crate a method that will print whether giving String is plindrome or not 
	
		
		
			public static void main(String[] args) {
				Task task1 = new Task();
				task1.largerNumber(300, 400);
				task1.evenOrOdd(99);// argument 
				task1.evenOrOdd(10);
				task1.palindrome("hello");
				task1.palindrome("madam");
			}
			
			 //1.  create a method that will take 2 parameters as numbers and prints 
			//   which number is larger	
			
			void largerNumber(int firstNumber, int secondNumber) { // the void method execute form the main method 
				if (firstNumber > secondNumber) {
					System.out.println("The larger number is" + " " + firstNumber);
				} else if (firstNumber < secondNumber) {
					System.out.println("The larger number is" + " " + secondNumber);
				} else {
					System.out.println("Numbers are equal");
				}
			}
			//2. create a method that will take a number and prints whether 
			//the number is even or odd
			
			void evenOrOdd(int number) {// perameter 
				if (number % 2 == 0) {
					System.out.println("the number is even number");
				} else {
					System.out.println("the number is odd number");
				}
			}
	//3. crate a method that will print whether giving String is palindrome or not 
			void palindrome(String word) {
		        String reverse = "";
		        for (int i =word.length() - 1; i >= 0; i--) {
		              reverse = reverse + word.charAt(i);
		        } 
				if (word.equals(reverse)) {
					System.out.println("The string is a palindrome.");
				} else {
					System.out.println("The string isn't a palindrome.");
		        }
		    }
}
