package com.class14;

public class interviewjAvaquestion {
	
	public static void main(String[] args) {
		// Questions # 1
		//1. write a program to swap 2 numbers without a temporary variable?
		//Swap 2 string without a temporary variable
		
	int x=10;
	int y=5;
	
	x=x+y;
	y=x-y;
	x=x-y;
	
		System.out.println(x);
		System.out.println(y);
		
		//System.out.println(" x was =10 and now x= "+x); or you can print it this way 
		//	System.out.println("y was =5 and now y="+y);
		System.out.println("********************");
		
		
		
		String str1="Moe";
		String str2="Hawa";
		
		System.out.println("Before swap " + str1 + " " + str2);
				str1=str1+str2 ;
		str2=str1.substring(0,str1.length()- str2.length());
	str1=str1.substring(str2.length());
	System.out.println("after swap " + str1 + "  " + str2);
	
	System.out.println("********************");
	
	
	//Question #2 :
	//Find a java program to find the second largest in the array and minimum number in the array? 

    
    int arr[] = { 14, 46, 47, 86, 92, 52, 48, 36, 66, 85 };
    int largest = arr[0];
    int secondLargest = arr[0];
    
    System.out.println("The given array is:" );
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]+"\t"); // for the space use \t
    }
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] > largest) {
            secondLargest = largest;
            largest = arr[i];
        } else if (arr[i] > secondLargest) {
            secondLargest = arr[i];
        }
    }
    System.out.println("\nSecond largest number is:" + secondLargest);// \n to print the second line 
    System.out.println("***************************");
    
    //Question # 3
    
    //Find out how many alpha characters present in a string?
    
    
String str4="Java is hard, but we can learn it";
	System.out.println(str4.length());
	
	System.out.println("********************");
	
	//Question # 4
//	How to find out the part of the string from a string? What is substring?Find number of words in string?
	
	String str="We have Java class on Saturdays and Sundays";
    String[] arr1=str.split(" ");
    for (int i = 0; i < arr1.length; i++) {
    }
    for (int i = arr.length-1;i>=0; i--) {
    System.out.print(arr[i]+" ");
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
	