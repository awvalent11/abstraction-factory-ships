package org.example;

public abstract class BetBuilding {
    //This acts as an ordering mechanism for creating
    //Bets that have wager data, game data & name
    //& nothing else

    //The specific components used for wager & game depend
    //upon the Enum & number that is passed to this method

    protected abstract Bet makeBet(WagerType wagerType);
    //When called a new Bet is made. The specific parts
    //are based on the String entered. After the ship is made
    //we execute multiple methods in the Bet Object


    public Bet createThisBet(WagerType wagerType) {

        Bet bet = makeBet(wagerType);

        bet.displayBetData();

        return bet;
    }

}
