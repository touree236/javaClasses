package arrayManipilation;

public class TwoDimentionalArrays {
	public static void main(String[] args) {
		
	//Declare 2D Array or known as matrix from
		
		int [][] array=new int [3][4];
		
		// 1st row 
		array[0][0]=44; 
		array[0][1]=80;
		array[0][2]=33;
		array[0][3]=20;
		
		// 2nd row 
		array[1][0]=10; 
		array[1][1]=5;
		array[1][2]=77;
		array[1][3]=8;
		
		// 3rd fow 
		
		array[2][0]=10; 
		array[2][1]=9;
		array[2][2]=70;
		array[2][3]=8;
		
	System.out.println(array[1][2]);
	
	System.out.println("*************");
	
	
	// Task : create 2D array of string with 2 and 3 columns . array 
	
	int[][] numbers= {
			{8,7,5,3,8},
			{1,5,6,4,9},
			{3,6,8,0,7},
	}; 
	//System.out.println("The value in index1 and 4 is= "+number[1][4]);
	
	// to identify the numbers of rows 
	System.out.println(numbers[1][4]);
	// or system.out.println(" The number of Arrays are:="+numbers.length); 
	// to identify the numbers of columns 
	
    System.out.println(numbers.[0] length); // the number [1] inside the array will show the column 
 // or system.out.println(" The number of Arrays are:="+numbers[1].length); 
	System.out.println("**************");
    
    
    for (int i=0;i<numbers.length; i++) {
    		for ( int j=0; j<numbers[i].length;j++) {
    			System.println([i][j]+ " ");
    		}
    		System.out.println();
    		
    		}
	} 
}





