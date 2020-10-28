package ru.muravyov.structures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FinalListValues{
    protected int[] arr;
    public FinalListValues(int ... values){
        this.arr = Arrays.copyOf(values, values.length);
    }
    public FinalListValues(FinalListValues list){
        this(list.arr);
    }
    public int get(int index){
        if (index >= arr.length) throw new IllegalArgumentException("ListIndexOutOfBoundsException");
        return arr[index];
    }
    public void replace(int index, int value){
        if (index >= arr.length) throw new IllegalArgumentException("ListIndexOutOfBoundsException");
        arr[index] = value;
    }

    @Override
    public String toString() {
        return Arrays.toString(arr);
    }

    public boolean empty(){
        return arr.length == 0;
    }

    public int size(){
        return arr.length;
    }

    public int[] toArray(){
        return arr;
    }
}
