package com.sv.game;

public class Game {

    public static void main(String[] args){
        try {
            //For 6 players and chosen number 2
            System.out.println("For 6 players and chosen number 2");
            System.out.println("Winning Child ID is " +  GameUtil.findWinner(6,2));
            //For 10 players and chosen number 7
            System.out.println("For 10 players and chosen number 7");
            System.out.println("Winning Child ID is " +  GameUtil.findWinner(10,7));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
