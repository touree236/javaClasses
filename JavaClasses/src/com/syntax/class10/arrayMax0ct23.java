package com.syntax.class10;

public class arrayMax0ct23 {
	

import java.util.Scanner;

    public static void main(String[] args) {
  
    
        Scanner scan = new Scanner(System.in);
        System.out.println("Hey body, tells us the size of the array:");
        int size = scan.nextInt();
        int[] array = new int[size];
        System.out.println("The size of the array is " + size);
        
        // read values into array
        
        for (int i = 0; i < size; i++) {
            System.out.println("Enter a number");
            array[i] = scan.nextInt();
        }
        
        System.out.println("--------------------");
        
        // print values of the array
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }

    
}
