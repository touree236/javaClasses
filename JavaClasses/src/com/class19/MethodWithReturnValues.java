package com.class19;

import com.Class16.recapNov14;

public class MethodWithReturnValues { //Nov 14 2019



		public static void main(String[] args) {
			/*
			 * declare a String and if String has more than 10 characters-->String is large
			 * otherwise --> String is small
			 */
			String str = "Welcome home";
			int numOfChars = str.length();

			if (numOfChars > 10) {
				System.out.println("String is large");
			} else {
				System.out.println("String is small");
			}

			char character = str.charAt(4);
			System.out.println(character);
			// create an object of the class where method is defined
			recapNov14 obj = new recapNov14();
			// int num=obj.sum(10, 30); compile error saying change return type
			// obj.sum(10, 20);

			MethodWithReturnValues obj1 = new MethodWithReturnValues();
			int sum = obj1.sum(50, 50);
			System.out.println(sum);
			int large=obj1.findLargest(20, 40);
			System.out.println(large);
		}

		// return type, method name (list of parameters)
		int sum(int num1, int num2) {
			int c = num1 + num2;
			return c;
		}

		// method to find largest number
		int findLargest(int num1, int num2) {

			int largest;
			if (num1 > num2) {
				largest = num1;
			} else {
				largest = num2;
			}
			return largest;
		}
	}
		
		
		
