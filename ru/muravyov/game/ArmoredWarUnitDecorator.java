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
    public void setAttack(Supplier<Integer> attack) {

    }

    @Override
    public void setDefend(Predicate<Integer> defend) {

    }

    @Override
    public int getHealth() {
        return 0;
    }

}
