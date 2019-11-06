package arrayManipilation;

public class arrays2Dreviewoct30 {
	public static void main(String[] args) {
		
		   int[][] a=new int[3][4];
	        a[1][2]=3;
	        a[2][1]=5;
	        for(int row=0;row<a.length;row++) {
	            for (int col=0;col<a[row].length;col++) {
	                int value=a[row][col];
	                System.out.print(value+ " ");
	            }
	            System.out.println();
	        }

		
		
	}
	
	
	
	

}
