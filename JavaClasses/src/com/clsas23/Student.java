package com.clsas23;

public class Student { // task 2
	
	/* Write a java program of Class Students that takes students name and 3 
    * subject grades. Inside your class also have a method to Calculate Average Grade. 
    * Test Student class for 5 different students with different marks. 
    * Your program should print an average mark of each students name.
    *NOTE: please use different names for instance and local variables
	 */
	
	String name;
	int grade1,grade2,grade3;

	Student(String studentName, int gr1,int gr2, int gr3){ // student and 3 subject grade
		name=studentName;
		grade1=gr1;
		grade2=gr2;
		grade3=gr3;
	}
	
	public void calcuateAverage() { 
		
		// create the object here 
		
		Student student1=new Student("John",90,78,100);
		student1.calcuateAverage();
		
		Student student2=new Student("moe",88,78,90);
		student1.calcuateAverage();
		
		Student student3=new Student("sophie",95,77,100);
		student1.calcuateAverage();
		
		Student student4=new Student("hatem",100,100,100);
		student1.calcuateAverage();
		
		Student student5=new Student("bob",88,90,96);
		student1.calcuateAverage();
		
		int avarage=(grade1+grade2+grade3)/3;
		System.out.println("student "+name+" has an avrage grade of ");
		
		
		
	}

}
