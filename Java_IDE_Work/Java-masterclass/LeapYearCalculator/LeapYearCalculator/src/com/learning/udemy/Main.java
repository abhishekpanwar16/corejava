package com.learning.udemy;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        System.out.println("Leap Year check :" + isLeapYear(1924));
    }

    public static boolean isLeapYear(int year){
        if(year<=0){
            return false;
        }
        if (year % 4 == 0 && year < 10000) {
            //System.out.println("First Check :" + year % 4 + " Second condition check :" + year % 100 + " Third Condition check : " + year % 400);
            if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}