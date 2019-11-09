package InterviewQuestionJavaNov10;

public class intviewquestion5 {
	public static void main(String[] args) {
	
		//Question # 5 
		//Write a java program to reverse String? Reverse a string word by word?
			
			 String given="Welcome to Java Class";
			 
			 //to reverse string 
			 //split
			 //step: split -->array of string
			 //step2: use for loop and use decrements to print value\
			 
			 String reversed="";   // reverse by words
			
		     String[] str=given.split("\\s");   
		     for (int j = str.length-1 ; j >= 0; j--) {
		    	 reversed = reversed + str[j];
		     }            
		     System.out.println(reversed);
		 System.out.println("************************");
		 
		 // second way // reverse by charachter
		 
		 String given1="Today is Java Class";  
		 char [] charArray=given1.toCharArray();
		 for (int i=charArray.length-1; i>=0; i--) {
			 System.out.print(charArray[i]);
		 }
		 
          
	System.out.println("************************");
		 
	    // 
	    
		 String word3="I love Java"; 
		 for (int i=word3.length()-1; i>=0; i--) {
			 System.out.print(word3.charAt(i));
		 
		 
		 
		 }
	}

}
