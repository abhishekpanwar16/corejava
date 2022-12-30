package com.learning.udemy;

public class Main {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        /*boolean newGameOver =true;
        int newScore=10000;
        int newLevelCompleted=8;
        int newBonus=200 ;*/

        /*if(score<5000 && score>1000){
            System.out.println("Your score is less than 5000 but greater than 1000");
        }else if(score<1000){
            System.out.println("Your score is less than 1000");
        }else{
            System.out.println("Got here");
        }*/

        //int finalScore = 0;
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your First Game Final Score is : " + finalScore);
        }

        score=10000;
        bonus=200;
        levelCompleted=8;
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your Second Game Final Score is : " + finalScore);
        }
        /*int savedFinalScore = finalScore;
        System.out.println("Saved Final Score : " + savedFinalScore);*/
    }
}