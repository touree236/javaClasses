package com.Class16;

public class Computer {
	
	
	
	
	
	
    // difine features , attributes
    boolean keybord, mouse;   // until the public statis
                          //     below this is the template
    int screen, monitor, ram, memory;
    String name, brand;
    void playGames() {
        // method body
        System.out.println("i can pleay on my" + name);
    }
    void javaCoding() {
        System.out.println("i cam do Java coding on my" + name);
    }
    void watchMovie() {
        System.out.println("i can watch movie on my" + name);
    }
    public static void main(String[] args) {
        
        Computer comp1=new Computer();
        comp1.brand="Apple";
        comp1.name="MackBook";
        comp1.memory=250;
        
        System.out.println("I have "+comp1.brand+comp1.name);
        comp1.javaCoding();
        comp1.watchMovie();
        
       
        
        
        
        
        
    }
}
	
	
	
