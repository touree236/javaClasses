package com.Class21;

public class StudentJava {
    public String studentName;
    public double GPA;
    public String school;
    
    public void displayInfo() {
        System.out.println(studentName + " attending " + school + " has a GPA of " + GPA);
    }
    public void study(int hours) {
        int localVariable = 4;
        System.out.println(studentName + " is studying for " + hours + " hours.");
    }
}


