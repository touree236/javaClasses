package com.javaAndOrNot;

public class AndOrNot {
	
	private void mian(String[] agrs) {
		
		/* if # is between 1-10 --># is small 
		 * if # is between 10-100 --># is medium
		 *  if # is between 100-1000 --># is large
		 *  any other # --> is out of the range
		 */
		
		int num=200;
		
		if ( num>1 && num <10) {
		System.out.println("number is small ");// true and false --> false
	} else if (num>=10 && num <100) {
		System.out.println("this number is medium");// true and false --> false 
	} else if ( num >=100 && num <1000) {
		System.out.println("this number is large");// true and true --> true 
	}else { 
		System.out.println("numberis out of our range");
		
	
	}

	}
}
