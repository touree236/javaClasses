package arrayManipilation;

import java.util.Scanner;

public class task1 {
	public static void main(String[] args) { // array with scanner 
		
	
	
	int[]array2= {2,5,4,7};
	
	for(int i:array2) {
		System.out.println(i);
	}
	int[] array=new int[3];
			Scanner scan=new Scanner(System.in);
	
	for (int i=0;i<array.length;i++) {
		array[i]=scan.nextInt(); // this loop allows you to print all the values 
	
	}
	
	for (int i=0;i<array.length;i++) {
		System.out.println(array[i]+" ");
	}

}
}