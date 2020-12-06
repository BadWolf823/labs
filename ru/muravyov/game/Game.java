package ru.muravyov.game;

public class Game {
    private Player player1;
    private Player player2;

    public Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public Player battle() {
        WarUnit unit1 = player1.makeWarUnit();
        WarUnit unit2 = player2.makeWarUnit();
        System.out.println("BATTLE");
        while (true){
            if (!unit1.defend(unit2.attack())) return player2;
            if (!unit2.defend(unit1.attack())) return player1;
        }
    }
}
