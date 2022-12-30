package com.learning.udemy;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        System.out.println("Checking teen :" + hasTeen(90,190, 99));
    }

    public static boolean hasTeen(int age1, int age2, int age3){
        return isTeen(age1) || isTeen(age2) || isTeen(age3);
    }
    public static boolean isTeen(int age){
        if(age>=13 && age<=19){
            return true;
        }else{
            return false;
        }
    }
}