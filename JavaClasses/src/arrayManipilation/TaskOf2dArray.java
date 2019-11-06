package arrayManipilation;

public class TaskOf2dArray {
	
	
	public static void main(String[] args) {
		
		//Create a 2D array of integer type with 3 rows and 4 columns and print all values of the whole array.
		
	        int[][] numbers = {
	                { 8, 7, 5, 3 },
	                { 1, 5, 6, 7 },
	                { 3, 6, 8, 1 }
	                };
	        
	        int sum=0;
	        for (int i = 0; i < numbers.length; i++) {
	            for (int j = 0; j < numbers[i].length; j++) {
	                //System.out.print(numbers[i][j] + ” “);
	                
	                sum=sum+numbers[i][j];
	            }
	            System.out.println();
	        }
	        System.out.println("The sum of all elements in the array is=" +sum);
	        
	        int sum1=0;
	        for(int nums[]: numbers) {
	            for(int getNum:nums) {
	                sum1=sum1+getNum;
	            }
	        }
	        System.out.println("The sum of all elements in the array is=" +sum1);
	    }
}
