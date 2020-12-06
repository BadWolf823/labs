package ru.muravyov.game;

import java.util.function.Predicate;
import java.util.function.Supplier;

public class Orc implements EffectUnit, WarUnit{
    private int health = 100;
    private int damage = 10;
    private Supplier<Integer> attack = ()-> this.damage;
    private Predicate<Integer> defend = x -> {
        this.health -= this.damage;
        return this.health > 0;
    };

    @Override
    public int attack() {
        return attack.get();
    }

    @Override
    public boolean defend(int damage) {
        System.out.println("Орку был нанесён урон " + damage);
        return defend.test(damage);
    }

    @Override
    public Orc clone() {
        Orc newOrc;
        try {
            newOrc = (Orc) super.clone();
        } catch (CloneNotSupportedException e){
            newOrc = null;
        }
        return newOrc;
    }

    @Override
    public void setAttack(Supplier<Integer> attack) {
        this.attack = attack;
    }

    @Override
    public void setDefend(Predicate<Integer> defend) {
        this.defend = defend;
    }

    @Override
    public int getHealth() {
        return health;
    }


    @Override
    public void addHealth() {
        health +=5;
    }

    @Override
    public void addDamage() {
        damage += 10;
    }

    enum State{
        CALM{
            @Override
            public int attack() {
                return 0;
            }

            @Override
            public boolean defend(int x) {
                return true;
            }
        },
        NORMAL{
            @Override
            public int attack() {
                return 0;
            }

            @Override
            public boolean defend(int x) {
                return false;
            }
        },
        DEAD{
            @Override
            public int attack() {
                return 0;
            }

            @Override
            public boolean defend(int x) {
                return false;
            }
        }
        ;

        public abstract int attack();
        public abstract boolean defend(int x);

    }
}
