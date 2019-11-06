package arrayManipilation;

public class StringToEndofAnother {
public static void main(String[] args) {
	// very impotrant methed
	
	String str3="Hello";
	String str4="World";
	
	
	
	System.out.println(str3+str4);    // when you concatinate use space in the string after "Hello " or before " World"
	System.out.println(str3.concat(" "+str4));
	
	
	//#8 This method returns a copy of strings with leading and trailing White spaces omitted  

String str6="How are you?";
System.out.println(str6.trim());  // white space trim any extras in the word ,, in the beginning or the end of the word
	

//#9 This Method returns the character located at the strings specified index
// the string indexes start from zero. 

String str7="We might be done early today";
System.out.println(str7.charAt(7)); 

// #10 This method returns the index within this string of the first occurrence of the specified character or -1
// if the character does not occur 

String str8="We might be done early tdoay";
System.out.println(str8.indexOf('m'));
System.out.println(str8.indexOf('m',4));// if the assigned letter could not be found its going to give us -1

}
}
