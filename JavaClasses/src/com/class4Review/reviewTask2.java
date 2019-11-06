package com.class4Review;

public class reviewTask2 {
	public static void main(String[] args) {

		/*
		 * Write a program to find if the largest Number of three 
		 * numbers Print out
		 * System.out.println("Largest number is " + largestNumber); 
		 * Must use if then a
		 * else if and lastly else
		 */
		
		int a,b,c;
		a=2;
		b=3;
		c=5;

		// this was a homework
		
		// insturctors way 
		
      Double n1 = -1.0, n2 = 4.5, n3 = -5.3, largestNumber;

      if (n1 >= n2) {

          if (n1 >= n3) {

              largestNumber = n1;

          } else {

              largestNumber = n3;

          }

      } else {

          if (n2 >= n3) {

              largestNumber = n2;

          } else {

              largestNumber = n3;

          }

      }
   System.out.println("Largest number is " + largestNumber);

		
	}

}
