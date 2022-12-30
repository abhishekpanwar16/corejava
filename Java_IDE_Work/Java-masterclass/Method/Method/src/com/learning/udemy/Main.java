package com.learning.udemy;

public class Main {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 5000;
        int levelCompleted =5;
        int bonus =100;
        int finalScore=  calculateScore(gameOver, score,levelCompleted,bonus);
        System.out.println("Your Final Score of the game is : " + finalScore);
        score = 10000;
        levelCompleted = 8;
        bonus = 200;
        finalScore = calculateScore(gameOver, score,levelCompleted,bonus);
        System.out.println("Your Final Score of the game is : " + finalScore);
    }
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){


        if(gameOver){
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            //System.out.println("Your Final Score of the game is : " + finalScore);
            return  finalScore;
        }else{
            return -1;
        }

    }
}