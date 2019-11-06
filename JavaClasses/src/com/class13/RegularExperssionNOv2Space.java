package com.class13;

public class RegularExperssionNOv2Space {
public static void main(String[] args) {
	
	String str="Today is our java class";
	
	System.out.println(str.replace(" ", "")); // replace space with nothing ""
	System.out.println("************");
	System.out.println(str.replaceAll("\\s", ""));

	String doc="             ";
			
System.out.println(doc.toLowerCase().replace("video", "Audio"));// since we used .toLoweCase make sure to change "Video to lower case
System.out.println(doc.replaceAll("powerfull(.*)","")); 	



}
}
