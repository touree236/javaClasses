package com.class22;

public class LocalVariables {
// local variables declared inside the class and inside the method. 
	//The scope of the variable is only within that method 	
	
public static void main(String[] args) {
	// I want to access variable myName from different method
	LocalVariables obj=new LocalVariables();
	obj.sayName();
	System.out.println("--------------------");
	//System.out.println(myName);
	String userEmail = obj.createEmail("jone,Smith,outlook");
	System.out.println(UserEmail);
}

void sayName() {
	String myName="Jone";
	System.out.println(myName);
	//--> wont be accessible , scope is only within main method
	//System.out.println(obj);
	
}

String creatEmail(String name, String lastName, String email);
String userEmail=name+lastName+"@"+email+"com"; // these ln will get concatenated
	return userEamil;
	
	

}
