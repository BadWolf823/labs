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
    public void setAttack(Supplier<Integer> attack) {
        unit.setAttack(attack);
    }

    @Override
    public void setDefend(Predicate<Integer> defend) {
        unit.setDefend(defend);
    }

    @Override
    public int getHealth() {
        return 0;
    }

}
