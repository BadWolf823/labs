package ru.muravyov.main;
import ru.muravyov.game.*;

public class Main {

    public static void main(String[] args) {
        Player player1 = new Player("1", new Elf(), x-> x.addDamage());
        Player player2 = new Player("2", new Orc(), x->x.addHealth());
        WarUnit unit1 = player1.makeWarUnit();
        unit1.setAttack(()->35);
        WarUnit unit2 = player2.makeWarUnit();
        unit2.defend(unit1.attack());
        unit1.defend(unit2.attack());

    }
}
