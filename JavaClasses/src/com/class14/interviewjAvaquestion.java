package com.class14;

import java.util.Arrays;

public class interviewjAvaquestion {
	
	public static void main(String[] args) {
		// Questions # 1
		//1. write a program to swap 2 numbers without a temporary variable?
		//Swap 2 string without a temporary variable
		
	int x=10;   /// arthmatic apporation 
	int y=5;
	
	x=x+y;  // x=10+20= 30 
	y=x-y;  // y=30-20=10
	x=x-y;  // x=30-10=20
	
		System.out.println("The value of x="+x);  
		System.out.println("The value of x="+y);
		
		//System.out.println(" x was =10 and now x= "+x); or you can print it this way 
		//	System.out.println("y was =5 and now y="+y);
		System.out.println("********************");
		

		String str1="Moe";
		String str2="Hawa";
		str1=str1+str2; // MoeHawa // we have to contactinate 
		
		
		System.out.println("Before swap " + str1 + " " + str2);
				str1=str1+str2 ;
		       str2=str1.substring(0,str1.length()- str2.length());
	           str1=str1.substring(str2.length());
	           System.out.println("after swap " + str1 + "  " + str2);
	
	System.out.println("********************");
	
	
	//Question #2 :
	//Find a java program to find the second largest in the array and minimum number in the array? 

    
    //int [] arrays= { 100,-90, 8787,898,0,1,-90,8787 };
    // easiest way sort way 
    //Arrays.sort(array);
   // int min=array[0];
    // int max=array[array.length-1];
  //   System.out.println(min);
  //  System.out.println(max);
    
    // or use the second way  // if the interviewer asks us not to use sort way 
    
    int nums[] = { 100,-90, 8787,898,0,1,-90,8787 };
    int large=nums[0];  // use the for loop to solve this problem 
    int secondlargest = nums[0];
 
    for (int i = 0; i < nums.length; i++) {
    	
        if (nums[i] > large) {
        	secondlargest = large;
        	large = nums[i];
        } if (nums[i] > secondlargest && nums[i]<large) { // in order for this to work we have to put a second condition 
        	
        	secondlargest = nums[i];
        }
    }
    System.out.println("\n Second largest number is:" + secondlargest);// \n to print the second line 
    
    System.out.println("***************************");
    
    //Question # 3
    
    //Find out how many alpha characters present in a string?
    
    
    String str4="Java is hard,123498763 but we can learn it";
   str4.replaceAll("[^A-Za-z]", str4);
	System.out.println(str4.length());
	
	System.out.println("********************");
	
	//Question # 4
//	How to find out the part of the string from a string? What is substring?Find number of words in string?
	
	String str="We have Java class on Saturdays and Sundays";
    String[] arr1=str.split(" ");
    
    System.out.print(arr1[i]+" ");
    
   System.out.println("**************************");

	
	//Question # 5 
//Write a java program to reverse String? Reverse a string word by word?
	
	 String reverseString = "";
     String str3 = " Love you ";
     char[] name = str3.toCharArray();
     for (int j = name.length-1 ; j >0; j--) {
         reverseString = reverseString + name[j];
     }            
     System.out.println(reverseString);
     
    
 System.out.println("************************");
	
	//Questions # 6
	//Write a Java Program to find whether a String is palindrome or not?// find out how to solve this 
	
 String string="Kayak";
 boolean flag=true;
 string=string.toLowerCase();
 for(int k=0; k<string.length()/2;k++);
 int k=0;
 if(string.charAt(k)!=string.charAt(string.length()-k-1)) {
     
     flag=false;
     
 }    
     
 if(flag)
     System.out.println("Given string is palindrome");
 else {
     System.out.println("Given string is not a palindrome");
     System.out.println("***********************");
	
	
	
	//Questions # 7
	// Write a java program to check whether a given number is prime or not?  find out how to solve this 
 
 int num = 33, w = 2;
 boolean flag1 = false;
 while(w <= num/2)
 {
     // condition for nonprime number
     if(num % i == 0)
     {
         flag1 = true;
         break;
     }
     ++i;
 }
 if (!flag1)
     System.out.println(num + " is a prime number.");
 else
     System.out.println(num + " is not a prime number.");
System.out.println("******************************");
	
	//Question #8 
	//Write a Java Program to print first 10 numbers of Fibonacci series.
//The Fibonacci sequence: 0, 1, 1, 2, 3, 5, 8, 13, 21

    int n = 10, t1 = 0, t2 = 1;
    System.out.print("First " + n + " terms: ");
    for (int m = 1; m<= n; ++i)
    {
        System.out.print(t1 + " + ");
        int sum = t1 + t2;
        t1 = t2;
        t2 = sum;
        
        
        
    }
    }
}
}
 
	}
	
