package com.class30;

public class DrivableTest {

	public static void main(String[]args) {
		Drivable obj=new Toyota();
		obj.drive();
		// Drivable.DRIVE_FAST=false we will get a compiler error- final value cann't be reassigned 
	Toyota toyota=new Toyota();
	toyota.drive();
	toyota.stop();
	
	}
}
