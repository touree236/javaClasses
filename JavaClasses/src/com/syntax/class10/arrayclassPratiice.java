package com.syntax.class10;

public class arrayclassPratiice {
	
	public static void main(String[] args) {
	
		// String [] names {"Diana","Hatem","Moe","Kiven","Calico"};
		
		String[] names=new String[5];
		names[0]= "Dinan";
		names[1]="Hatem";
		names[2]="Moe";
		names[3]="kiven";
		names[4]="Calio";
		
		int size=names.length;
	for (int i=0; i<size; i++) {
		System.out.println(names[i]+" ");
	}
		// or 	System.out.println(names[1]);
	}
	
	

}
