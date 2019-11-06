package com.class3;

public class PrimitiveCasting {
public static void main (String[]args) {
	
	double d=12;
	System.out.println(d);
	
	//i=12.0, comple time error you can't use int with a a point like 12.0 
	
	
	//Casting -changing/converting one type to another 
	
	//Widening ( implicit) performed automatically 
	//byte--> Short--> int--> long-->  float--> double
	
	byte b=127;
	int i=b;
	
	int num=123;
	double d1=num;System.out.println(d1);
	

	//Narrowing ( Explicit/manual)
	//Double--> float--> long--> int-->  short--> byte
	
   double d2=123.56;
   int num2= (int)d2;
   System.out.println(num2);
 

  int num3=1000;
  byte b1=(byte)num3;
  System.out.println(b1);
  
  int num3=789;
  byte b1=(byte)num3;
System.out.println(b1);



}
}
