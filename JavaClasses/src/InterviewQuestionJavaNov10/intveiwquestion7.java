package InterviewQuestionJavaNov10;

public class intveiwquestion7 {
	
public static void main(String[] args) { // Question #7 
	// Write a java program to check whether a given number is prime or not?  find out how to solve this 
	// prime: is a number that has to meet 2 conditions :
	// it should be divisible by 1 and by itself only 
	//2,3,5,7,11,13,17,19,23
 
	// take range of numbers from 2 to 100 and print all prime 
	//2,3(2,3, 4(2,3,4), 5(2,3,5,) 
	
 int num = 20; /// change the number her to find out if the prime is true to false 
		 
 boolean isPrime=true;
 
for(int i=2; i < num; i++) {

     if(num % i == 0)   // condition for nonprime number
    	 isPrime=false;
     break;
}
 
 if (isPrime) {
     System.out.println(num + " is a prime number");
 }else
     System.out.println(num + " is NOT a prime number");

 }
	
 }

	
	