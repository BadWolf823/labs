package ru.muravyov.geometry;

import ru.muravyov.geometry.Point;
import ru.muravyov.geometry.Chainable;
import ru.muravyov.geometry.PolygonalChain;

import java.util.ArrayList;
import java.util.List;

public class UnionPolygonalChain {
    public static PolygonalChain unionPolygonalChain(Chainable... figures){
        List<Point> points = new ArrayList<>();
        for (Chainable figure : figures){
            points.addAll(figure.getPolygonalChain().points);
        }
        return new PolygonalChain(points.toArray(new Point[0]));
    }
}
