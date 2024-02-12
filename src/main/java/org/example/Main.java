package org.example;

public class Main {
    public static void main(String[] args) {
        EnemyShipBuilding MakeUFOs = new UFOEnemyShipBuilding();

        EnemyShip theGrunt = MakeUFOs.orderThisShip("UFO");
    }
}