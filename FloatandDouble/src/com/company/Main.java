package com.company;

public class Main {

    public static void main(String[] args) {

        //Width of int = 32 (4 bytes)
	    int intValue = 5 / 3;
        //Width of float = 32 (4 bytes)
        float floatvalue = 5f / 3f;
        //Width of double = 64 (8 bytes)
        double doublevalue = 5d / 3d; //If given as a decimal in declaration, java assumes its a double
        System.out.println("int value: " + intValue);
        System.out.println("float value: " + floatvalue);
        System.out.println("double value: " + doublevalue);

        double pounds = 140d;
        double kilograms = pounds * 0.453_592_37d;
        System.out.println("Kilograms = " + kilograms);


    }
}
