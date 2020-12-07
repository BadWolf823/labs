package ru.muravyov.game;

import java.util.function.Predicate;
import java.util.function.Supplier;

public class ArmoredWarUnitDecorator extends WarUnitDecorator{
    public ArmoredWarUnitDecorator(WarUnit unit){
        super(unit);
    }
    @Override
    public int attack() {
        return unit.attack() + 10;
    }

    @Override
    public boolean defend(int damage) {
        return unit.defend(damage);
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
