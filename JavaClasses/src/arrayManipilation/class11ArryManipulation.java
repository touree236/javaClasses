package arrayManipilation;

import java.util.Arrays;

public class class11ArryManipulation {
	
	// interview question , how can you sort the elements of an array .. we have a class called an arrays and 
	// we have a class called method 
	

	public static void main(String[] args) {
		
		
		String []actualName = {"Moe", "Smith", "Alex","Jack"};
		String [] expectedNames= {"Jack","Moe","Alex","Smith"};
		
		
		 // to sort the element 
		
		Arrays.sort(actualName);
		
		System.out.println(Arrays.toString(actualName));
		Arrays.sort(expectedNames);
		
		String actual=Arrays.toString(actualName);
		String expected=Arrays.toString(expectedNames); 
		
		System.out.println(actual.equals(expected));
		
		
int[] numbers= {123,34,15,66,99};
        
        for(int i:numbers) {
            System.out.print(i+" ");
        }
        
        System.out.println();
        System.out.println("**********");
        
        
        Arrays.sort(numbers);  
        for(int i:numbers) {
            System.out.print(i+ " ");
        }
		}
}
