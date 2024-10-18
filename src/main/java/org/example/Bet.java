package org.example;

public abstract class Bet {
    //Newly defined objects that represent weapon & engine
    //These can be changed easily by assigning new parts
    //in UFOEnemyShipFactory

    Integer betId;
    private String betName;
    Long userId;
    // We can do IDs with foreign keys for games or we can do the Game object and cascade
    // Test both options with dummy data
    public Game game;
    public Wager wager;

    public String getBetName(){
        return betName;
    }

    abstract void makeBet();
    //Because I defined the toString method in engine
    //when it is printed the String defined in toString goes
    //on the screen


    public void displayBetData(){
        System.out.printf("The name of this bet is %s, and it's value is %n", betName, wager.getValue());
    }
}

