package com.syntax.class2review;

public class breakAndCOntiexercse {
	public static void main(String[] args) {
		// I want to print nums form 1 to 20 except 5,6,7  //// Break 
		
		//// break and contiune keyword can be used insdie any loop , mostley it will used within if statment
		/// break vs continue
		//break -> exit /break 
		
		for (int a=1; a<20; a++) {
			if ( a==5||a==6||a==7) {
				break;
			}
			System.out.println(a);
		}
		
		System.out.println("**********************");
		
				// I want to print nums form 1 to 20 except 5,6,7  //// continue 
				
				for (int a=1; a<20; a++) {
					if ( a==5 && a==6 && a==7) {
						continue;
					}
					System.out.println(a);
				}

				
	}

}
