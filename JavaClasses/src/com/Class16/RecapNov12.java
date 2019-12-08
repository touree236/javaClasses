package com.Class16;

public class RecapNov12 {
	// method describes  behavior  of an object 
	
	 int students, teachers,classrooms;
	    String name, address, website;
	    
	    void study() {
	    	
	        System.out.println("Students studying at "+name);
	    }
	    void teach() {
	        System.out.println("Teachers teaching at "+name);
	    }
	    public static void main(String[] args) {
	        RecapNov12 school=new RecapNov12();
	        school.name="Syntax";
	        school.students=200;
	        
	        RecapNov12 school1=new RecapNov12();
	        school1.name="Pinnacle";
	        school1.students=150;
	        
	        school1.teach();//we are calling the method teach
	        school.study();
	    }
	}

