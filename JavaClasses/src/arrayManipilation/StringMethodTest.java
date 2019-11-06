package arrayManipilation;

public class StringMethodTest {
public static void main(String[] args) {
	
	
	
	//#1  This method tests if a string starts with the specified prefix beginning 
	// does it start with the word we are looking for Yes or no 
	// Tests if this string starts with the specified prefix.
	
    
	
	String str2="Tts is very hot in the class";
	System.out.println("Is this strting starts with="+str2.startsWith("It"));
	// System.out.println("Is this string starts with="+str2.startsWith("It",3));
	
	
	//#2 This method test if this string ends with the specified suffix
	
	System.out.println("Is this string ends with="+str2.endsWith("class"));
	
	// #3This method checks whether a String is empty or not.
	// this method returns true if the given string is empty, else it returns False.
	
	String str= "";
	System.out.println("Is this string empty="+str.isEmpty());
	String str21="Hello";
	System.out.println("Is this string empty="+str.isEmpty());
	
	System.out.println();
	
	if( !str.isEmpty()) {
		System.out.println("This is not epmty");
	}else {
		System.out.println("This is empty String");
	}
	
	//String sentence="Each day has \t a promise to brighten up the day, /n but first you must have fun";
	//System.out.println(sentece1);
	// if we use \t it gives us a tab or a space between words. 
	// if we use /n it gives us a new line or prints on a new line 
	
}
}
