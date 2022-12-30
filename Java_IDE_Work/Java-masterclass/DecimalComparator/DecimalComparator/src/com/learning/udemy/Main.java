package com.learning.udemy;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        System.out.println("Checking equality : " + areEqualByThreeDecimalPlaces(3.1756,3.1757));
    }

    public static boolean areEqualByThreeDecimalPlaces(double decimalValue1, double decimalValue2){
        double check1 = (int)(decimalValue1 * 1000);
        double check2 = (int)(decimalValue2 * 1000);

        if(check1 - check2 ==0){
            return true;
        }else{
            return false;
        }
    }
}