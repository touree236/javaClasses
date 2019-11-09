package InterviewQuestionJavaNov10;

public class intviewquestion6 {
	

public static void main(String[] args) {
	
	
	//Questions # 6
	//Write a Java Program to find whether a String is palindrome or not?// find out how to solve this 
	// if revered string and original string are same -->string palindrome 
	// mom, dad, madam bob , kayak
	//logic 
	// step 1 reverse the string
	// step 2 compare 2 Strings: if strubgs are equal -> Palindrome  
	// else 
	
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
     
 }
}
}
