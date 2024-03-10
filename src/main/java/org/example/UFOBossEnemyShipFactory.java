package org.example;

import ESUFOBoss.ESUFOBossEngine;
import ESUFOBoss.ESUFOBossGun;

public class UFOBossEnemyShipFactory implements EnemyShipFactory {


    @Override
    public ESWeapon addESGun() {
        return new ESUFOBossGun();
    }

    @Override
    public ESEngine addESEngine() {
        return new ESUFOBossEngine();
    }
}
