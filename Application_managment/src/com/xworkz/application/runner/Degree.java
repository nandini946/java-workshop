package com.xworkz.application.runner;

public class Degree {
    public static void main(String args[]){
        String degreeNames[] = {"BCA","BE","BTECH","MCA","MSC"};
        System.out.println("accessing the array element using index number");
        System.out.println(degreeNames[0]);
        System.out.println("Length of array elements:"+degreeNames.length);
        System.out.println("accessing array element");
        for (int i=degreeNames.length-1;i>=0;i--) {
            System.out.println(degreeNames[i]);
        }
    }
}
