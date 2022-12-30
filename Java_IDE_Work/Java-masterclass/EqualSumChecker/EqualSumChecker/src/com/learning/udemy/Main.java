package com.learning.udemy;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        System.out.println("CHecking third integer is sum of 2 or not : " + hasEqualSum(1,-1,0));
    }

    public static boolean hasEqualSum(int a, int b, int c){
        if((a+b) == c){
            return true;
        }else{
            return false;
        }
    }
}