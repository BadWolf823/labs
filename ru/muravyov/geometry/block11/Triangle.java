package ru.muravyov.geometry.block11;

import ru.muravyov.geometry.block1.Point;

import java.util.Arrays;

public class Triangle extends Figure implements Chainable{
    Point[] points = new Point[3];

    public Triangle(Point point1, Point point2, Point point3) {
        points[0] = point1;
        points[1] = point2;
        points[2] = point3;
    }


    @Override
    public double getArea() {
        return 1 / 2. * Math.abs(
                (points[1].x - points[0].x) *
                        (points[2].y - points[0].y) -
                        (points[2].x - points[0].x) *
                                (points[1].y - points[0].y)
        );
    }

    @Override
    public PolygonalChain getPolygonalChain() {
        return new PolygonalChain(points);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "points=" + Arrays.toString(points) +
                '}';
    }
}
