package org.example;


public class MoneyLine extends Bet {
    //We define the type of ship we want to create
    //by stating we want to use the factory that
    //makes the enemy ships

    BetFactory betFactory;


    //The enemy ship required parts list is sent to
    //this method. They state that the enemy ship
    //must have a weapon and engine assigned. That
    //object also states the specific parts needed
    //to make a regular UFO versus a Boss UFO




    protected void makeBet() {
        System.out.println("Making new Moneyline Bet: " + getBetName());
        // The specific weapon & engine needed were passed in
        // shipFactory. We are assigning those specific part
        // objects to the UFOEnemyShip here
        betFactory.addWagerData();
        betFactory.addGameData();

    }

    public MoneyLine(BetFactory betFactory) {
        this.betFactory = betFactory;
    }

    //EnemyShipBuilding calls this method to build a
    //specific UFOEnemyShip

}

