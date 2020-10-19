package ru.muravyov.geometry.block11;

import java.util.ArrayList;
import java.util.List;
import ru.muravyov.geometry.block1.Point;

public class Main {
    public static void main(String[] args) {
        Rectangle square = new Rectangle(new Point(1,2),2);
        Triangle triangle = new Triangle(new Point(1,6),new Point(6,1), new Point(1,1));
        System.out.println(unionPolygonalChain(square,triangle));
    }
    public static PolygonalChain unionPolygonalChain(Chainable... figures){
        List<Point> points = new ArrayList<>();
        for (Chainable figure : figures){
            points.addAll(figure.getPolygonalChain().points);
        }
        return new PolygonalChain(points.toArray(new Point[0]));
    }
}
