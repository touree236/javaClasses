package InterviewQuestionJavaNov10;

public class stringtothesameobject {
public static void main(String[] args) {
	
	
	/// stack and Heap // the difference between == and .equals 
	// string literal is best to use since it uses the same memory 
	
	String str1="Hello";
	String str2="Hello";
	String st3=new String("Hello");
	String st4=new String("Hello");  
	
	System.out.println(str1.equals(str1));
	System.out.println(str1.equals(str2));    // they are pointing to the same object 
	
	System.out.println("**********************");
	
	System.out.println(str1==str1);
	System.out.println(str1==str2);    // they are creating new object when you as new string 
	
	
	
	
	
	
	
	
	
	
}
	
	
	
	
}
