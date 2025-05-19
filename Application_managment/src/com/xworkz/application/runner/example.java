package com.xworkz.application.runner;

public class example {
    public static void main(String[] args) {
        int number[]= {67, 87, 98, 34} ;
        System.out.println("length of array element:" + number.length);
        System.out.println("reverse of number");
        for (int i = number.length - 1; i >= 0; i--)
        {
            System.out.println(number[i]);
        }
    }
}