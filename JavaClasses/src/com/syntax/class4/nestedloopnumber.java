package com.syntax.class4;

public class nestedloopnumber {


	public static void main(String[] args) {
		
	//print 
	/*
	 * 12345
	 * 12345
	 * 12345
	 * 12345
	 */
		
			 for( int r=1; r<5; r++) {// r for rows 
			 
			 for (int c=1;c<6; c++) {// c for cols 
				 System.out.print(c);
				
			 }
			 System.out.println();

	}
System.out.println("----------------------------------------");

//print 
//11111
//22222
//33333
//44444
//55555

for( int i=1; i<5; i++) {// r for rows will be taking care of the outer loop 

for (int j=1;j<6; j++) {// c for cols will be taking care of the inner loop 
	 System.out.print(j);
	
}
System.out.println();

}
}
}





