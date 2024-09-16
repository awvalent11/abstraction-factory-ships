package org.example;

public class MoneylineBuilding extends BetBuilding{
    //This is the only class that needs to change, if you
    //want to determine which enemy ships you want to
    //provide as an option to build

    @Override
    protected Bet makeBet(BetType betType){
        EnemyShip theEnemyShip = null;
        //If UFO was sent to grab use the factory that knows
        //what types of weapons and engines a regular UFO
        //needs. The EnemyShip object is returned & given a name


        //should these if statements be sport and bet type for the different building classes?
        if(betType.equals("Moneyline")){
            EnemyShipFactory shipPartsFactory = new UFOEnemyShipFactory();
            theEnemyShip = new UFOEnyShip(shipPartsFactory);
            theEnemyShip.setName("First regular UFO Enemy Ship");
        }

        if(betType.equals("Moneyline")){
            EnemyShipFactory shipFactory = new UFOEnemyShipFactory();
            theEnemyShip = new UFOBossEnemyShip(shipFactory);
        }

        return theEnemyShip;
    }

}


