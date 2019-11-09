package InterviewQuestionJavaNov10;

public class intviewquestion4 {
	
	
	
	//Question # 4
//	How to find out the part of the string from a string? What is substring?Find number of words in string?
	
	public static void main(String[] args) {
		
	      String str="Today is very cold outside";
	        
	        String subString=str.substring(0, 5);
	        
	        System.out.println(subString);
	        
	        System.out.println("*************************************");
	        
	        String [] words=str.split(" ");
	        System.out.println(words.length);
	    }		
		
	}
