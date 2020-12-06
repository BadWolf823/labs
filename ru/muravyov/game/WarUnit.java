package ru.muravyov.game;

import java.util.function.Predicate;
import java.util.function.Supplier;

public interface WarUnit extends Cloneable{
    int attack();
    boolean defend(int damage);
    WarUnit clone();
    void setAttack(Supplier<Integer> attack);
    void setDefend(Predicate<Integer> defend);
    int getHealth();
}
