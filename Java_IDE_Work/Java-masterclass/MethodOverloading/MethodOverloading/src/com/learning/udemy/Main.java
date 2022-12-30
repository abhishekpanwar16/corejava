package com.learning.udemy;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        int newScore = calculateScore("Abhishek", 90);
        System.out.println(" New Score : " + newScore);
        calculateScore(90);
    }

    public static int calculateScore(String playerName, int score){
        System.out.println("Player Name :" + playerName + " who scored : " + score);
        return score * 1000;
    }

    public static int calculateScore(int score){
        System.out.println("Un-named player scored : " + score);
        return score * 1000;
    }
}