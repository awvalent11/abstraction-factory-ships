package org.example;


import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        //EnemyShipBuilding handles orders for the new EnemyShips
        //You send it a code using the orderTheShip method &
        //it sends the order to the right factory for creation
        UFOEnemyShipBuilding MakeUFOs = new UFOEnemyShipBuilding();

        UFOEnyShip theGrunt = (UFOEnyShip) MakeUFOs.orderThisShip("UFO");



    }
}