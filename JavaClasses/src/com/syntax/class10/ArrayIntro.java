package com.syntax.class10;

public class ArrayIntro {
	
	
	public static void main(String[] args) {
		
		// arry is a collection of similar types of data 
		// array can hold multiple value inside the array // values inside the array called elements 
		// array is a contain that can hold values of the same type 
		// int[] array=new int[]3--> we are crating an array of integers with the size of 3 
		//( we can place 3 elemnts/items /value;
		//we can't store another types inside array 
		//int[] array=new int[3] --> we must store only integers 
		//if we try to store valut of any other type --> complier will give an error " Cannot Convert.."
		//the since of an array is fixed
		// if we store more vale  than the actual size on array --> 
		// we will get runtime execption --> 
		// ArrayIndexOutBoundExeption
		
		
		//1st way 
		int a;
		a=10; 
		
		int a1=10; // declaration and initlization at the same time 
	   int []b; // declare and array --> preferred way 
	   
		b=new int[4]; 
		
		// 2nd way --> all in one line ( declaration and initialization)
		
		int[] array=new int[4]; // array always starts from 0 
		array[0]=10;
		array[1]=20;
		array[2]=30;
		array[3]=40;
		// access value from an arry 
		System.out.println(array[2]);
		
		// lets create and array that store classes 
		
		String [] classes=new String[4];
		classes[0]="Java";
		classes[1]="SDLC";
		classes[2]="Manual Testing";
		classes[3]="GIT";
		// we have Java classes
		System.out.println("Today we have"+ classes[0]+"class");
		System.out.println("------------------------------------------");
		
// array could be boolean, string , Etc 
		
		int[] nums=new int[3];
		nums[0]=1;
		nums[1]=2;
		nums[2]=3;
		// how can i change 1-100
		nums[0]=100;
		System.out.println(nums[0]);
		System.out.println(nums[0]+ nums [2]);// total of 103 100+3  since 0=100 so 100+2 [2]+1=103 
		
		String[] names=new String[3];
		names[0]= "Dinan";
		names[1]="Hatem";
		names[2]="Moe";
		  //names[3]="Olga"; during run time we will get an exception , it did not print since the variable [3]
		// is not recognaized so it will give the below msg
		   //ArrayIndexOutOfBoundsExecption
		System.out.println(names[3]);
		
		int[] numbers=new int[4];// 
		numbers [1]=100;
		numbers[3]=200;
		
		System.out.println(numbers[0]);// if you print it, it will give you zero. even though it gave 
		
	}
//	public class SpacePyramid {  //  class review 
//	    //     1
//	    //    12
//	    //   123
//	    //  1234
//	    // 12345
//	    public static void main(String[] args) {
//	        
//	        for (int i = 1; i <= 5; i++) {
//	            for (int j = 5 - i; j >= 1; j--) {
//	                System.out.print(" ");
//	            }
//	            for (int m = 1; m <= i; m++) {
//	                System.out.print(m);
//	            }
//	            System.out.println();
//	        }
//	    }
//	}

// inilaization  ,,, condition ,, loop body and then increment or decrment ( 
	
}
