package ru.muravyov.game;

import java.util.function.Predicate;
import java.util.function.Supplier;

public interface WarUnit extends Cloneable, Effectable{
    int attack();
    boolean defend(int damage);
    WarUnit clone();
    int getHealth();

}
