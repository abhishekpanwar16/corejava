package com.learning.udemy;

public class OperatorChallenge {
    public static void main(String[] args) {
        double opChallengeDouble = 20d;
        double opChallengeDouble2 = 80d;
        double additionOperation = (opChallengeDouble + opChallengeDouble2);
        double multipleOperation = additionOperation * 100.00;
        double remainderOperation = multipleOperation % 40.00;
        boolean checkBooleanResult = (remainderOperation ==0 ) ? true : false;
        System.out.println("check Boolean result : "+checkBooleanResult);
        if(!checkBooleanResult){
            System.out.println("Got some Remainder!!!");
        }
    }
}
