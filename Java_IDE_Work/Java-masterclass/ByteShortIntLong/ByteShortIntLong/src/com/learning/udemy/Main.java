package com.learning.udemy;

public class Main {
    public static void main(String[] args) {
        int intValue = 10000;
        int maxIntValue = Integer.MAX_VALUE;
        int minIntValue = Integer.MIN_VALUE;
        System.out.println("Maximum int value : " + maxIntValue);
        System.out.println("Minimum int value : " + minIntValue );
        System.out.println("Busted Maximum Int value : " + (maxIntValue + 1));
        System.out.println("Busted Minimum int Value : " + (minIntValue -1));

        int maxIntValueTest = 2147483647;
        System.out.println(maxIntValueTest);

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Min Value : " + myMinByteValue);
        System.out.println("Byte Max Value : " + myMaxByteValue);

        Short myMinShortValue = Short.MIN_VALUE;
        Short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Min Value : " + myMinShortValue);
        System.out.println("Short Max Value : " + myMaxShortValue);

        long myLongValue = 100L;
        System.out.println(myLongValue);
        Long myMinLongValue = Long.MIN_VALUE;
        Long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Min Value : " + myMinLongValue);
        System.out.println("Long Max Value : " + myMaxLongValue);


        //Casting Examples
        int myTotal = (minIntValue / 2);
        short myNewShortValue = (short) (myMinShortValue / 2);
        byte myNewByteValue = (byte)(myMinByteValue/2);
        long myNewLongValue = (myMinLongValue/2);
    }
}