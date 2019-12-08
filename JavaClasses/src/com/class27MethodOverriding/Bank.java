package com.class27MethodOverriding;

public class Bank {
	
	double money;
	
	public double chargeFee() {
		double fee=0;
		if(money<1000) {
		fee =money*0.1;
		} else {
			fee=0;
		}
		return fee;
}
}
                  // this is how to write 2 classes in the same file 
class PNC extends Bank{  // you can create another class inside another class but outside public class
	public double chargeFee() {    // we are just writing the method 
		double fee;
		if(money<1000) {
			fee=money*0.05;
		}else {
			fee=0;
		}
		return fee;
		}
	}
	
