package InterviewQuestionJavaNov10;

public class Intviewquestion1 {
	
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
	}
}
