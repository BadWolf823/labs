package ru.muravyov.structures;

import java.util.Arrays;

public class MutableListValues extends FinalListValues{
    public MutableListValues(int ... values) {
        super(values);
    }

    public MutableListValues(MutableListValues list){
        this(list.arr);
    }

    public void add(int value){
        arr = Arrays.copyOf(arr, arr.length + 1);
        arr[arr.length - 1] = value;
    }

    public void add(int index, int value){
        if (index >= arr.length) throw new IllegalArgumentException("ListIndexOutOfBoundsException");
        arr = Arrays.copyOf(arr,arr.length + 1);
        for (int i = arr.length - 1; i > index; i++){
            arr[i] = arr[i - 1];
        }
        arr[index] = value;
    }

    public void remove(int index){
        if (index >= arr.length) throw new IllegalArgumentException("ListIndexOutOfBoundsException");
        for (int i = index; i < arr.length; i++){
            arr[i] = arr[i+1];
        }
        arr = Arrays.copyOf(arr, arr.length - 1);
    }
}
