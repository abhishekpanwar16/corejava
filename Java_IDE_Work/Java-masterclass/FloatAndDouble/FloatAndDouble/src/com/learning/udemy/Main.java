package com.learning.udemy;

public class Main {
    public static void main(String[] args) {
        float newFloatMinValue = Float.MIN_VALUE;
        float newFloatMaxValue = Float.MAX_VALUE;
        System.out.println("New Float Min Value : " + newFloatMinValue);
        System.out.println("New Float Max Value : " + newFloatMaxValue);

        Double newDoubleMinValue = Double.MIN_VALUE;
        Double newDoubleMaxValue = Double.MAX_VALUE;
        System.out.println("New Double Min Value : " + newDoubleMinValue);
        System.out.println("New Double Max Value : " + newDoubleMaxValue);

        int intValue = 5/3;
        float floatValue = 5f/3f;
        double doubleValue = 5.00/3.00;
        System.out.println("my int value : " + intValue);
        System.out.println("my float value : " + floatValue);
        System.out.println("my double value : " + doubleValue);
    }
}