package org.example;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public abstract class Wager {
    // Types of wagers: moneyline (will contain home and away), over/under, total, straight w-l (will contain home and away), props -> (contain odds, position, value, expiration, game id)
    private Enum WagerType;
    Double odds;
    Double position;
    Double value;
    LocalDate expiration;

    //uses to query game API
    Integer gameId;
    private String betName;
    //Newly defined objects that represent weapon & engine
    //These can be changed easily by assigning new parts
    //in UFOEnemyShipFactory

}