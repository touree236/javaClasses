package com.class25;

import com.Class16.main;

public class Test {
	public static void main(String[] args) {
		
	System.out.println("Creating an object");	
	
	Employee emp=new Employee();
	emp.salary=70000;
	Employee.companyName="Syntax";
	emp.work();
	emp.getPaid();
	System.out.println("Creating an object o ");
	
	ScrmTeam sm=new ScrmTeam();
	sm.salary=90000;
	sm.work();
	sm.getPaid();
	sm.artifacts="product Backlog, burndown chart";
	sm.cermonies="Sprint demo, planning,spring retro,Daily stand up";
	sm.attendsScrumMeetings();
	
	Developer dev=new Developer();
	dev.salary=1300000;
	dev.work();
	dev.getPaid();
	dev.code();
	
	Tester tes=new Tester();
	tes.salary=5000000;
	tes.work();
	tes.getPaid();
	tes.test();
	
	ProductOwner po=new 	ProductOwner();
	po.salary=100000;
	po.work();
	po.getPaid();
	po.coordinate();
	
	
	}

}
