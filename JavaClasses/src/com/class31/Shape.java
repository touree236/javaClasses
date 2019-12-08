package com.class31;

interface Shape {
	

	/* Create an Interface ‘Shape’ with undefined methods as calculateArea 
	/ * and calculatePerimiter . 
	/ * Create 2 child classes: Circle & Square that
	/ *  should have an implementation of area and perameter calculation.
	/ *   Test your code. 
	/ */


	void calculatArea();
	void calculatePerimeter();
}
class Circle implements Shape {
	final double pi=3.14;
	int radius;
	Circle(int radius){
		this.radius=radius;
	}
	@Override
	public void calculatArea() {
		System.out.println(pi*radius);
	}
	@Override
	public void calculatePerimeter() {
	System.out.println(2*pi*radius);
	}
}
class Square implements Shape{
   double side;
   Square(double side) {
   	 this.side=side;   
   }
   @Override
	public void calculatArea() {
  System.out.println("the area of the square is"  + side*side);
	}
   
	@Override
	public void calculatePerimeter() {
		System.out.println("the perimeter of a square is" +side*4);
	}
}

