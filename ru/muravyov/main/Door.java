package ru.muravyov.main;

import java.util.ArrayList;
import java.util.List;

public class Door {
    public static final Door ONE = new Door();
    public static final Door TWO = new Door();
    public static final Door THREE = new Door();

    private Door(){};

    public Prize open(){
        if (this == ONE) return Prize.getPrizeFromList(0);
        if (this == TWO) return Prize.getPrizeFromList(1);
        if (this == THREE) return Prize.getRandomPrize();
        return null;
    }
}
