package com.class27MethodOverriding;

public class StudentTest {
	
	

	public static void main(String []args) {
		SyntaxStudent student1=new SyntaxStudent();
	    student1.study();
	    student1.research();
	    student1.doHomework();
	    student1.attendClasses(); 
	    
	    Student student2=new SyntaxStudent();
	    student2.study();
	    student2.attendClasses(); 
	    student2.research();
	    student2.attendClasses(); 
	    
	   Student student3=new school();
	    student3.study();
	    student3.attend(); 
	    student3.research();
	   
	    
	    
	}
}
