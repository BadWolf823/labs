package ru.muravyov.game;

import java.util.function.Predicate;
import java.util.function.Supplier;

public class Elf implements WarUnit, EffectUnit{
    protected int health = 150;
    protected int damage = 5;
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

        System.out.println("Эльфу был нанесён урон " + damage);
        return defend.test(damage);
    }

    @Override
    public void addHealth() {
        health += 10;
    }

    @Override
    public void addDamage() {
        damage += 5;
    }

    @Override
    public Elf clone(){
        Elf newElf;
        try {
            newElf = (Elf) super.clone();
        } catch (CloneNotSupportedException e){
            newElf = null;
        }
        return newElf;
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
        return this.health;
    }
}
