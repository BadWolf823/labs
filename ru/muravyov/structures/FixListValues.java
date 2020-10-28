package ru.muravyov.structures;

import java.util.Arrays;
import java.util.List;

public class FixListValues{
    protected int[] arr;
    private int length = 0;
    public FixListValues(){
        this(10);
    }
    public FixListValues(int maxLength){
        arr = new int[maxLength];
    }
    public FixListValues(FixListValues list){
        this.arr = Arrays.copyOf(list.arr, length = list.arr.length);
    }
    public void add(int value){
        this.add(length, value);
    }
    public void add(int index, int value){
        if (!this.isNotFull()) throw new IllegalArgumentException("MaxLengthReached");
        if (index > length) throw new IllegalArgumentException("ListIndexOutOfBoundsException");
        for (int i = length; i > index; i--){
            arr[i] = arr[i - 1];
        }
        arr[index] = value;
        length++;
    }
    public void add(int ... values){
        this.add(length, values);
    }
    public void add(int index, int ... values){
        for (int value : values){
            this.add(index++, value);
        }
    }
    public void remove(int index){
        if (index >= length) throw new IllegalArgumentException("ListIndexOutOfBoundsException");
        for (int i = index; i < length; i++){
            arr[i] = arr[i+1];
        }
        length--;
    }

    public int get(int index) {
        if (index >= length) throw new IllegalArgumentException("ListIndexOutOfBoundsException");
        return arr[index];
    }

    public void replace(int index, int value){
        if (index >= length) throw new IllegalArgumentException("ListIndexOutOfBoundsException");
        arr[index] = value;
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.stream(arr).limit(length).toArray());
    }

    public boolean empty(){
        return length == 0;
    }

    public boolean isNotFull(){
        return length < arr.length;
    }

    public int size(){
        return length;
    }

    public int[] toArray(){
        return arr;
    }
}
