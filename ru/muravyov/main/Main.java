package ru.muravyov.main;

import ru.muravyov.numbers.Fraction;

public class Main{
    public static void main(String[] args) {
        Fraction fraction = new Fraction(3,1);
        Fraction fraction1 = new Fraction(2,4);
        Object[] objects = clone(fraction, fraction1);
        for (Object obj : objects){
            System.out.println(obj);
        }
    }
    public static PublicCloneable[] clone(PublicCloneable ... obj){
        PublicCloneable[] objects = new PublicCloneable[obj.length];
        for(int i = 0; i < objects.length; i++){
            objects[i] = (PublicCloneable) obj[i].clone();
        }
        return objects;
    }
}

