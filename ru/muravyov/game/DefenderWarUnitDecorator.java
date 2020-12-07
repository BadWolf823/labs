package ru.muravyov.game;

import java.util.function.Predicate;
import java.util.function.Supplier;

public class DefenderWarUnitDecorator extends WarUnitDecorator{

    public DefenderWarUnitDecorator(WarUnit unit) {
        super(unit);
    }

    @Override
    public int attack() {
        return unit.attack();
    }

    @Override
    public boolean defend(int damage) {
        return unit.defend(damage - 5);
    }

    @Override
    public int getHealth() {
        return 0;
    }

    @Override
    public void addHealth() {

    }

    @Override
    public void addDamage() {

    }
}
