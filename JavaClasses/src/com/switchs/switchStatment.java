package com.switchs;

public class switchStatment {
	public static void main(String[] args) {
		/*
		 * 7weekdays
		 * if day==1 --> monday
		 * if day==2 --> tuesday
		 */
	
		int day=6 ;
		
				String weekDay;
		
				if ( day==1) {
					weekDay="Monday";
				}else if(day==2) {
					weekDay="Tuesday";
				}else if(day==3) {
					weekDay="Wednesday";
				}else if(day==4) {
					weekDay="Thursday";
				}else if(day==5) {
					weekDay="Friday";
				}else if(day==6) {
					weekDay="Saturday";
				}else if(day==7) {
					weekDay="Sunday";
				}else {
						weekDay="invaid";
					
								System.out.println("weekDay");
					}
				// switch statement execute one statment from mutiple 
				//condition a switch works
				//with byte, short,char, and string 
		
				switch(day){
				case 1://day==1
					weekDay="Monday";
					break;
				case 2:
					weekDay="Tuesday";
					break;
				case 3:
					weekDay="Wedensday";
					break;
				case 4:
					weekDay="Thursday";
					break;
				case 5:
					weekDay="Friday";
					break;
				case 6:
					weekDay="Saturday";
					break;
				case 7: 
					weekDay="Sunday";
					break;
				default:
					weekDay="invlid";
					
			System
			.out.println(weekDay);
							
				
	}

}
