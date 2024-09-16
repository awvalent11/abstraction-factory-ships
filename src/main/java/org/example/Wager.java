package org.example;

import java.time.LocalDate;

public abstract class Wager {
    // Types of Bets: moneyline (will contain home and away), over/under, total, straight w-l (will contain home and away), props -> (contain odds, position, value, expiration, game id)
    Double odds;
    Double position;
    Double value;
    LocalDate expiration;

    //uses to query game API
    Integer gameId;
    private BetType betType;

    private String betName;
    //Newly defined objects that represent weapon & engine
    //These can be changed easily by assigning new parts
    //in UFOEnemyShipFactory

}