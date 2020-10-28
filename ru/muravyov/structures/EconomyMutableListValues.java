package ru.muravyov.structures;

import java.util.Arrays;

public class EconomyMutableListValues extends FixListValues{
    public EconomyMutableListValues() {}
    public EconomyMutableListValues(EconomyMutableListValues list) {
        super(list);
    }

    @Override
    public void add(int index, int value) {
        if (this.size()  == arr.length) arr = Arrays.copyOf(arr, arr.length + arr.length/2);
        super.add(index, value);
    }
}
