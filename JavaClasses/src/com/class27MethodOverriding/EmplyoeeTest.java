package com.class27MethodOverriding;

public class EmplyoeeTest {

public static void main (String []args) {
	
	EmplyeeMethodOverRiding emp=new EmplyeeMethodOverRiding();
	
	emp.salary=80000;
	emp.getPaid();
	
	Fulltime ft=new Fulltime();
	ft.salary=90000;
	ft.bounus=10000;
	
}
}
