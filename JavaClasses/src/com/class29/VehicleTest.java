package com.class29;

public class VehicleTest {

	public static void main(String[] args) {
		
		Car car=new BMW();// child class 
		car.drive();
		car.stop();
		car.start();
		car.speed();
		car.breaking();
		
		
		Vehicle vehicle= new BMW(); // parent class 
		vehicle.drive();
		vehicle.stop();
		vehicle.start();
		vehicle.speed();
		
		
		
	}
	
	
}
