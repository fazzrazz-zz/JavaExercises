package com.company;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
//
//        if (score <= 5000 && score >= 1000) {
//            System.out.println("Your score was 5000");
//
//        } else if (score <= 1000) {
//            System.out.println("< 100");
//
//        } else {
//            System.out.println("Bah");
//        }

        if (gameOver) {
            int finalscore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalscore);

        }

        score = 10000;
        levelCompleted = 8;
        bonus = 200;
        if (gameOver) {
            int finalscore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalscore);
        }
    }
}
