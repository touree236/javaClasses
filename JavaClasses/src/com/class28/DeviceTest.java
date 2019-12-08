package com.class28;

public class DeviceTest {
	public static void main (String[]args) {
Apple apple=new Apple("Iphone","11Pro");// we are calling the constructor and passing the arreguament for the parameter 
System.out.println(apple.deviceType); 

Apple apple1=new Apple("ipad","12Pro");
System.out.println(apple.deviceType); // you are accessing the variable from the parent class 

	}

}
