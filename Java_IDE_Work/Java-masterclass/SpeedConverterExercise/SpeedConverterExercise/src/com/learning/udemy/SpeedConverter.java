package com.learning.udemy;

public class SpeedConverter {
    public static long toMilesPerHour(double kilometersPerHour){
        //long toMilesPerHour = 0l;
        if(kilometersPerHour<0){
            return -1;
        }
        return Math.round(kilometersPerHour / 1.609);
    }

    public static void printConversion(double kilometersPerHour){
        long toMiles = toMilesPerHour(kilometersPerHour);
        if(toMiles==-1){
            System.out.println("Invalid Value");
        }else {
            System.out.println(kilometersPerHour + "km/h = " + toMiles + "mi/h");
        }

    }
}
