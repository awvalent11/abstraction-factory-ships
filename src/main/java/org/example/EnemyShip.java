package org.example;

public abstract class EnemyShip {
    // This will be a Bet

    // Types of Bets: moneyline (will contain home and away), over/under, total, straight w-l (will contain home and away), props -> (contain odds, position, value, expiration, game id)
    //All bets will have
    //odds
    //position
    //value
    //expiration date
    //game id?

    private String name;
    //Newly defined objects that represent weapon & engine
    //These can be changed easily by assigning new parts
    //in UFOEnemyShipFactory

    public ESWeapon weapon;
    public ESEngine engine;

    public String getName(){ return name;}
    public void setName(String newName) {name = newName;}

    abstract void makeShip();
    //Because I defined the toString method in engine
    //when it is printed the String defined in toString goes
    //on the screen

    public void displayEnemyShip (){
        System.out.println(getName() + " is on the screen");
    }
    public void followHeroShip (){
        System.out.println(getName() + " is following the hero at " + engine );
    }
    public void enemyShipShoots (){
        System.out.println(getName() + " attacks and does " + weapon);
    }

    public String toString(){
        return "The "+ name +" has a top speed of "+ engine +
                " and an attack power of "+ weapon;
    }
}
