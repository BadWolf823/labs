package ru.muravyov.game;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private WarUnit exampleWarUnit;
    private Spell exampleSpell;
    private String name;
    public Player(String name, WarUnit warUnit, Spell spell){
        exampleWarUnit = warUnit;
        exampleSpell = spell;
        this.name = name;
    }
    public WarUnit makeWarUnit(){
        return exampleWarUnit.clone();
    }
    public Spell makeSpell(){
        return exampleSpell;
    }

    @Override
    public String toString() {
        return "Player " + name;
    }
}
