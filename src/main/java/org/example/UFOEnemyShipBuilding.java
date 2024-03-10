package org.example;

public class UFOEnemyShipBuilding extends EnemyShipBuilding {
    //This is the only class that needs to change, if you
    //want to determine which enemy ships you want to
    //provide as an option to build
    protected EnemyShip makeEnemyShip(String typeOfShip){
        EnemyShip theEnemyShip = null;
        //If UFO was sent to grab use the factory that knows
        //what types of weapons and engines a regular UFO
        //needs. The EnemyShip object is returned & given a name
        if(typeOfShip.equals("UFO")){
            EnemyShipFactory shipPartsFactory = new UFOEnemyShipFactory();
            theEnemyShip = new UFOEnyShip(shipPartsFactory);
            theEnemyShip.setName("First regular UFO Enemy Ship");
        }

        if(typeOfShip.equals("Boss")){
            EnemyShipFactory shipFactory = new UFOEnemyShipFactory();
            theEnemyShip = new UFOBossEnemyShip(shipFactory);
        }

        return theEnemyShip;
    }

}
