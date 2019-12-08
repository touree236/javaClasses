package com.class27MethodOverriding;

public class Car {
	public static void main(String[] args) {
		
	
	String make,model;
    int year;
    
    Car(){
    	System.out.println("I am non argument consturctor");
    }
    
    public void display() {
    	System.out.println("we build"+ year+""+make+""+model);
    }
    
public static void mian (String[]args) {
	Car car=new Car();
	car.display();
	
}
    
//int num;   --> local variable must be inialized 
 //  System.out.println(num);

}

	private void display() {
		// TODO Auto-generated method stub
		
	}
    
}
