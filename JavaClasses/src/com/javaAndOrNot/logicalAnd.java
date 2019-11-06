package com.javaAndOrNot;

import java.util.Scanner;

public class logicalAnd {
	public static void main(String[] args) {
		
	// home work for sunday oct- 6- 2019
		/*
 Write a program that will read three inputs of scores 
 (quiz, mid term, and final scores) and determine the grade based on the 
 following rules: 
if the average score >=90 → grade=A
if the average score >= 70 and <90 → grade=B
if the average score>=50 and <70 → grade=C
if the average score<50 → grade=F 
		 */
		
		Scanner Scan;
		int quiz, midTerm, finalScore,average;
		Scan=new Scanner(System.in);
				System.out.println("Please enter quiz score");
		quiz=Scan.nextInt();
		
		System.out.println("Please enter midterm score");
		midTerm=Scan.nextInt();
		
		System.out.println("Please enter final score");
		finalScore=Scan.nextInt();
		
		 average=(quiz+midTerm+finalScore/3);
		 
		if (average>=90){
System.out.println("A");	
		}else if (average>=70 ||average<90){
System.out.println("B");
		}else if (average>=50 && average<70){
System.out.println("C");
		}else if (average<50){
			System.out.println("D");
		}else {
			System.out.println("unknown");
		}
		
		
	}

}
