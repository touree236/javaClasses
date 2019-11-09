package InterviewQuestionJavaNov10;

public class intviewqustion2 {

	
	public static void main(String[] args) {
		
		
		
		//Question #2 :
		//Find a java program to find the second largest in the array and minimum number in the array? 

	    
	    //int [] arrays= { 100,-90, 8787,898,0,1,-90,8787 };
	    // easiest way sort way 
	    //Arrays.sort(array);
	   // int min=array[0];
	    // int max=array[array.length-1];
	  //   System.out.println(min);
	  //  System.out.println(max);
	    
	    // or use the second way  // if the interviewer asks us not to use sort way 
	    
	    int nums[] = { 100,-90, 8787,898,0,1,-90,8787 };
	    int large=nums[0];  // use the for loop to solve this problem 
	    int secondlargest = nums[0];
	 
	    for (int i = 0; i < nums.length; i++) {
	    	
	        if (nums[i] > large) {
	        	secondlargest = large;
	        	large = nums[i];
	        } if (nums[i] > secondlargest && nums[i]<large) { // in order for this to work we have to put a second condition 
	        	
	        	secondlargest = nums[i];
	        }
	    }
	    System.out.println("\n Second largest number is:" + secondlargest);// \n to print the second line 
	    
	    System.out.println("***************************");
				
		
	}
}
