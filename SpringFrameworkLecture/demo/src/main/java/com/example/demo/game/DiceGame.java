package com.example.demo.game;

public class DiceGame {
    int comDice;
    int uesrDice;

    public DiceGame() {
        comDice = (int)(Math.random() * 6) + 1;
        uesrDice = (int)(Math.random() * 6) + 1;
    }

    public void printWinner() {
        System.out.printf("사용자: %d, 컴퓨터: %d\n",
                comDice, uesrDice);

        if(comDice > uesrDice) {
            System.out.println("컴퓨터 승");
        } else if(comDice < uesrDice) {
            System.out.println("사용자 승");
        } else {
            System.out.println("무승부");
        }
    }
}
