package ru.muravyov.main;

import ru.muravyov.animals.Meowable;
import ru.muravyov.geometry.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] arrLength = getLength(
                new PolygonalChain(new Point(1, 2), new Point(1, 4)),
                new LengthableString("123"),
                new LengthableString("abc")
        );
        System.out.println(Arrays.toString(arrLength));
    }

    public static double[] getArea(Figure... objs){
        double[] arrLength = new double[objs.length];
        for (int i = 0; i < objs.length; i++){
            arrLength[i] = objs[i].getArea();
        }
        return arrLength;
    }


    public static double[] getLength(Lengthable ... objs){
        double[] arrLength = new double[objs.length];
        for (int i = 0; i < objs.length; i++){
            arrLength[i] = objs[i].getLength();
        }
        return arrLength;
    }
}

class CounterMeow implements Meowable{
    private Meowable obj;
    private int count = 0;
    CounterMeow(Meowable obj){
        this.obj = obj;
    }
    @Override
    public void meow() {
        count++;
        obj.meow();
    }

    public int getCount() {
        return count;
    }
}

class LengthableString implements Lengthable{
    String str;
    public LengthableString(String str){
        this.str = str;
    }

    @Override
    public double getLength() {
        return str.chars().sum();
    }
}
class StrArea extends Figure{
    private String str;
    StrArea(String str){
        this.str = str;
    }
    @Override
    public double getArea() {
        return str.length();
    }
}


