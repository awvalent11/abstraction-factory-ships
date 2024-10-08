package org.example;

import java.time.LocalDate;

public abstract class Bet {
    // Types of Bets: moneyline (will contain home and away), over/under, total, straight w-l (will contain home and away), props -> (contain odds, position, value, expiration, game id)
    Double odds;
    Double position;
    Double value;
    LocalDate expiration;
    Integer gameId;
    private BetType betType;

    private String betName;
    //Newly defined objects that represent weapon & engine
    //These can be changed easily by assigning new parts
    //in UFOEnemyShipFactory


    public Game game;
    public Wager wager;

    public String getBetName(){ return betName; }

    abstract void makeBet();
    //Because I defined the toString method in engine
    //when it is printed the String defined in toString goes
    //on the screen


    public void displayBetData(){
        System.out.printf("The name of this bet is %s, and it's value is %n", betName, value);
    }
}

