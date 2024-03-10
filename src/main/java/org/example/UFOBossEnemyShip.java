package org.example;

public class UFOBossEnemyShip extends EnemyShip{
    //Same comments as UFOEnemyShip
    EnemyShipFactory shipFactory;

    public UFOBossEnemyShip(EnemyShipFactory shipFactory){
        this.shipFactory = shipFactory;
    }

    protected void makeShip() {
        //TODO Auto-generated method stub

        System.out.println("Making boss enemy ship "+getName());
        //The specific weapon & engine needed were passed in
        //shipFactory. We are assigning those specifc part
        //objects to the UFOBossEnemyShip here
        weapon = shipFactory.addESGun();
        engine = shipFactory.addESEngine();
    }

    void stateYourName() {
        System.out.println("I am a Boss Enemy Ship!");
    }
}
