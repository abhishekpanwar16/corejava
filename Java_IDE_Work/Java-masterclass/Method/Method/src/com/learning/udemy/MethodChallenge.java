package com.learning.udemy;

public class MethodChallenge {
    public static void main(String[] args) {
        String playerName = "Abhishek";
        int playerScore = 1000;
        int highScorePosition = calculateHighScorePosition(playerScore);
        displayHighScorePosition(playerName, highScorePosition);

        playerName = "Tim";
        playerScore = 750;
        highScorePosition = calculateHighScorePosition(playerScore);
        displayHighScorePosition(playerName,highScorePosition);
    }

    public static void displayHighScorePosition(String playerName, int highScorePosition){
        System.out.println(playerName + " managed to get into position " + highScorePosition + " on the high score table.");
    }

    public static int calculateHighScorePosition(int playerScore){
        int position = 4;
        if(playerScore>=1000){
            position = 1;
            //return 1;
        }else if(playerScore >=500){
            //return 2;
            position = 2;
        }else if(playerScore >= 100){
            //return 3;
            position = 3;
        }/*else{
            //return 4;
        }*/
        return position;
    }
}
