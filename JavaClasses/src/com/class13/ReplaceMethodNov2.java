package com.class13;

public class ReplaceMethodNov2 {
private void mian() {
	
	// .replace90
	// this method returns a new string resulting from replacing all occurrence of oldChar in this string with newChar
		
	String str="Hello Dear, how are you, How you been";
	String str1="12-22-1990"; // replace - to /  way to do it ('-', '/'))
	
	
	// this method returns a new string resulting from replacing all occurrence of string in the string with new
	System.out.println(str.replace('n', 'z'));
	System.out.println(str.replace('-', '/'));
	System.out.println("---------------------------");
	System.out.println(str.replace("Dear", "Respected")); // you can change a sequance of Char
	
	System.out.println(str.replaceFirst("Dan","Ali"));
	

		/*
		 * print only text and not numbers
		 */
				
				String str2="14234Hel45645lo465456";//Hello
				
				
				System.out.println(str2.replaceAll("[0-9]", ""));//Leave only text
				System.out.println(str2.replaceAll("[a-zA-Z]", ""));//Leave only numbers 1423445645465456
				
				//Remove everything except text and numbers
				String str3="Hi#$%How#$%#$4356346";
				System.out.println(str3.replaceAll("[^a-zA-Z0-9]", ""));
				
				
		

	
}

}
