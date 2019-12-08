package com.class27MethodOverriding;

public class WebDriverTest {
public static void main(String[] args) {
	
	ChromeDriver chrome=new ChromeDriver();
	chrome.refresh();
	chrome.open();
	
	FireFoxDriver fire=new FireFoxDriver();
	fire.refresh();
		fire.open();
		
// Creating an object of the child class given reference to the
		WebDriver driver=new FireFoxDriver();  
		driver.open();   // the line inside the mothed this code stays the same 
		driver.refresh();// line 16-17 during the runtime execute the method to java class 
	// no access to child specific class through parent type 
			
	
	// if we create an object and we are referring to the parent , we are refering to the chlid 
		// WebDriver driver=new FireFoxDriver();
		// WebDriver= main parent class 
		// FireFoxDriver child class.. 
		
		
}
}
