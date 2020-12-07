package ru.muravyov.game;

public class Elf implements WarUnit, Effectable {
    protected int health = 150;
    private StateElf state = StateElf.CALM;
    @Override
    public int attack() {
        return state.attack();
    }

    @Override
    public boolean defend(int damage) {
        return state.defend(this, damage);
    }

    @Override
    public void addHealth() {
        health += 10;
    }

    @Override
    public void addDamage() {
        state = StateElf.ANGRY;
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
    public int getHealth() {
        return this.health;
    }

    private enum StateElf{
        CALM {
            @Override
            public int attack() {
                return 0;
            }
            @Override
            public boolean defend(Elf unit, int damage) {
                unit.state = NORMAL;
                return true;
            }
        },
        NORMAL {
            @Override
            public int attack() {
                return 10;
            }
            @Override
            public boolean defend(Elf unit, int damage) {
                if (unit.health <= damage) {
                    unit.health = 0;
                    unit.state = StateElf.DEAD;
                    return false;
                }
                unit.health -= damage;
                return true;
            }
        },
        ANGRY {
            @Override
            public int attack() {
                return 40;
            }

            @Override
            public boolean defend(Elf unit, int damage) {
                if (unit.health <= damage) {
                    unit.health = 0;
                    unit.state = StateElf.DEAD;
                    return false;
                }
                unit.health -= damage;
                return true;
            }
        },
        DEAD {
            @Override
            public int attack() {
                return 0;
            }

            @Override
            public boolean defend(Elf elf, int damage) {
                return false;
            }
        };
        abstract public int attack();
        abstract public boolean defend(Elf elf, int damage);
    }
}
