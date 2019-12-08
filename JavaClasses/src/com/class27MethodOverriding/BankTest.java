package com.class27MethodOverriding;

public class BankTest {
	
	public static void main(String[] args) {
		
		Bank bank=new Bank();
		bank.money=900;
		
		double fee=bank.chargeFee(); // you call it by the name of the method  and return the same value string or int
		System.out.println("Bank fee="+fee);
		
		PNC pnc=new PNC();
		double pncFee=pnc.chargeFee();
		System.out.println("PNC fee="+pncFee);
		
	}

}
