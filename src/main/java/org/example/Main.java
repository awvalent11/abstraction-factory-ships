package org.example;

public class Main {
    public static void main(String[] args) {
        //EnemyShipBuilding handles orders for the new EnemyShips
        //You send it a code using the orderTheShip method &
        //it sends the order to the right factory for creation
        EnemyShipBuilding MakeUFOs = new UFOEnemyShipBuilding();

        EnemyShip theGrunt = MakeUFOs.orderThisShip("UFO");
    }
}