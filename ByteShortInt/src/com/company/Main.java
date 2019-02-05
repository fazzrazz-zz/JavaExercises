package com.company;

public class Main {

    public static void main(String[] args) {

       /* int minValue = -2_147_483_647; // width of 32
        int maxValue = 2_147_483_647;
        int newInt = minValue / 2;
        System.out.println("The int value is: " + newInt);

        byte byteValue = -128; // only goes up to 127 and -127, width of 8
        //byte newbyte = (byteValue/2);  INCORRECT since java converts expressions to integers
        byte workingbyte = (byte)(byteValue / 2);
        System.out.println("The byte value is: " + workingbyte);

        short shortValue = 32767; //max value for short, width of 16
        short newshort = (short) (shortValue/2);
        System.out.println("The short value is: " + newshort);
        long longValue = 100L; //long has a width of 64, int capacity squared

         Called "casting" when you ensure the variable type in brackets before the expression
         */

       byte bytevalue = 127;
       short shortvalue = 32767;
       int intvalue = 2000;
       long longvalue = 50000L + 10L * (bytevalue + shortvalue + intvalue);
       System.out.println(longvalue);
    }
}
