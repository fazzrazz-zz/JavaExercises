package com.company;

public class Main {

    public static void main(String[] args) {
    String myString = "This is a string";
    System.out.println(myString);

    myString = myString + ", and this is more.";
    System.out.println(myString);

    String numberString = "250";
    numberString = numberString + "50";
    System.out.println(numberString);

    String lastString = "10";
    int myInt = 50;
    lastString = lastString + myInt;
    System.out.println(lastString);
    double doubleNumber = 20.5;
    lastString = doubleNumber + lastString;
    System.out.println(lastString);
    }
}
