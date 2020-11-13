package ru.muravyov.main;

public class Door {
    public static final Door ONE = new Door();
    public static final Door TWO = new Door();
    public static final Door THREE = new Door();

    private Door(){};

    public Prize open(){
        if (this == ONE) return Prize.AUTO;
        if (this == TWO) return Prize.EMPTY;
        return Prize.getRandomPrize();
    }
}
