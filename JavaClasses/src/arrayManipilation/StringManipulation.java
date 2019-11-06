package arrayManipilation;

public class StringManipulation {
	
	public static void main(String[] args) {
		// string is a sequance of char and its a java class and it non premitave 
		// strings are objects every string that you will crates is actullay an object  
		
	
		//1 
		// called String literal 
		String name="John";
		System.out.println(name);
		System.out.println(name.length());
		
		//2 
		// Creating String with new key word
		String name1=new String("Jone1");
		System.out.println(name1);
		
		/*
		 * this method returns the length of this string 
		 * the length is equal to the number of the 16 bit Unicode
		 * character in the string
		 */
		 int name1length=name.length();
		 System.out.println("The length of name1length is = "+ name1length);
		 
		 System.out.println("-------------------");
		 
		 String Str1="Hello woRld";
		
		System.out.println("Before:: "+Str1);
		 Str1 = Str1.toLowerCase();
		 System.out.println("Ater:: "+Str1);
	

		 // .equals 
		 //
		 String str2="HEllo WoRld";
		 
		 boolean isEqual=str1.equals(str2);
		 System.out.println(isEqual);
		 
		 //.equalIsIgnoreCase();
		 // this method does not care for capitalization and compare the content only 
		 boolean isEqual1=str1.equals(str2);
		 System.out.println(str1.equalsIgnoreCase(str2));
		 
		 
		 /*
		  * to UpperCase 
		  * this method converts all of the characters in the String to uppercase
		  */
		 String Str3="Mohammed";
			
			System.out.println("Before:: "+Str3);
			 String str3 = str3.toLowerCase();
			 System.out.println("Ater:: "+str1);
		
		 
//			  public static void main(String[] args) {
//			        //There are two ways to create string objects.
//			        //1
//			        //String Literal
//			        String name=“Jhon”;
//			        System.out.println(name);
//			        System.out.println(“The length of nameis= “+name.length());
//			        //2
//			        //Creating String with new key word
//			        String name1=new String(“John1”);
//			        System.out.println(name1);
//			        /*
//			         *This method returns the length of this string.
//			         *The length is equal to the number
//			         *of 16-bit Unicode characters in the string.
//			         */
//			        int name1Len=name1.length();
//			        System.out.println(“The lenght of name1 is= “+name1Len);
//			        
//			        System.out.println(“=================“);
//			        
//			        /*
//			         * toLowerCase();
//			         * This method converts all of the
//			         * characters in this String to lowercase     
//			         */
//			        String str1=“HelLo woRld”;
//			        System.out.println(“Before:: “+str1);
//			        str1 = str1.toLowerCase();
//			        System.out.println(“After:: “+str1);
//			        
//			        System.out.println(“=================“);
//			        
//			        //.equals()
//			        //This method will count everything such
//			        //capitalization and content
//			        String str2=“HElLo WoRld”;
//			        
//			        boolean isEqual=str1.equals(str2);
//			        System.out.println(isEqual);
//			        
//			        //.equalsIgnoreCase();
//			        //This method does not care for capitalization and compare the
//			        //content only
//			        System.out.println(str1.equalsIgnoreCase(str2));
//			        
//			        /*
//			         * toUpperCase();
//			         * This method converts all of the characters in
//			         * this String to uppercase
//			         */
//			        String str3=“Mohammad”;
//			        System.out.println(“Before :: “+str3);
//			        str3=str3.toUpperCase();
//			        System.out.println(“After:: “+str3);
//			    }
//			}
//	
//		
//	}
//	
//	
//
//}
