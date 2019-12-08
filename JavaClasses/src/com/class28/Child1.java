package com.class28;

public class Child1 extends Parent{

	String name="Hatem";
	
	public static void main(String[] args) {
		Child1 obj=new Child1();
		obj.callName();
		
	}
	
public void callName() {
System.out.println(name);
System.out.println(super.name);
System.out.println(lastName);

}
public void callingMethod() {
	callName();// By default this is added-so we are calling current class method 
	super.callName(); // if you hear the word super we calling 
}
}
