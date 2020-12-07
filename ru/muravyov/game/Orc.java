package ru.muravyov.game;

public class Orc implements WarUnit, Effectable {
    protected int health = 150;
    private StateOrc state = StateOrc.CALM;
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
        state = StateOrc.ANGRY;
    }

    @Override
    public Orc clone(){
        Orc newOrc;
        try {
            newOrc = (Orc) super.clone();
        } catch (CloneNotSupportedException e){
            newOrc = null;
        }
        return newOrc;
    }

    @Override
    public int getHealth() {
        return this.health;
    }

    private enum StateOrc{
        CALM {
            @Override
            public int attack() {
                return 0;
            }
            @Override
            public boolean defend(Orc unit, int damage) {
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
            public boolean defend(Orc unit, int damage) {
                if (unit.health <= damage) {
                    unit.health = 0;
                    unit.state = StateOrc.DEAD;
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
            public boolean defend(Orc unit, int damage) {
                if (unit.health <= damage) {
                    unit.health = 0;
                    unit.state = StateOrc.DEAD;
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
            public boolean defend(Orc unit, int damage) {
                return false;
            }
        };
        abstract public int attack();
        abstract public boolean defend(Orc unit, int damage);
    }
}
