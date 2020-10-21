package ru.muravyov.main;

import ru.muravyov.geometry.Point;

public class SimpleName {
    public static void method(String[] args) {
        Point myPoint = new Point(1,2);
        java.awt.Point point = new java.awt.Point();
        System.out.println(myPoint);
        System.out.println(point);
    }
}
