package InterviewQuestionJavaNov10;

public class intviewquestin8 {
	public static void main(String[] args) {
		
		
		//Question #8 
		//Write a Java Program to print first 10 numbers of Fibonacci series.
	//The Fibonacci sequence: 0, 1, 1, 2, 3, 5, 8, 13, 21   
		//we use it for the story point until # 13 once its 13 its called Epic used in jerah only 

	    int a,b,c;
	    a=0;
	    b=1;
	    
	    for (int i=0; i<10;i++) {
	     System.out.print(a+" ");
	     
	      c=a+b;
	      a=b;
	      b=c;
	        
		
		
	    }	
	}

}
