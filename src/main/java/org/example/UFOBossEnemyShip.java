package org.example;

public class UFOBossEnemyShip extends EnemyShip{
    //Same comments as UFOEnemyShip
    EnemyShipFactory shipFactory;

    public UFOBossEnemyShip(EnemyShipFactory shipFactory){
        this.shipFactory = shipFactory;
    }

    void makeShip() {
        //TODO Auto-generated method stub

        System.out.println("Making enemy ship "+getName());
        //The specific weapon & engine needed were passed in
        //shipFactory. We are assigning those specifc part
        //objects to the UFOBossEnemyShip here
        weapon = shipFactory.addESGun();
        engine = shipFactory.addESEngine();
    }
}
