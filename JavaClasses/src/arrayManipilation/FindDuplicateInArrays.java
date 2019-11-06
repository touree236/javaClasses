package arrayManipilation;

public class FindDuplicateInArrays {
	
	public static void main(String[] args) {
		int[] array2= {2,5,4,7,2}; // the more number you have duplicate here it will print it in the sysout 
		
		for (int i=0; i<array2.length;i++) {
			for (int j=i+1; j<array2.length;j++) { // this loop only runs 6 times since array2 hold 6 numbers 
		    if(array2[i]==array2[j]) {             // this loop runs 6*6 =36 times 
		    	System.out.println(array2[j]);
		    }
				
				
				
			}
		}
		
	}

}
