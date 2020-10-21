package ru.muravyov.geometry;

public class Rectangle extends Figure implements Chainable {
    Point point;
    private int a, b;

    public Rectangle(Point point, int a, int b){
        this.point = point;
        if ((a < 0)||(b < 0)) throw new IllegalArgumentException();
        this.a = a;
        this.b = b;
    }

    public Rectangle(Point point, int a){
        this(point, a, a);
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void setA(int a) {
        if (a >= 0) this.a = a;
    }

    public void setB(int b){
        if (b >= 0) this.b = b;
    }

    @Override
    public double getArea() {
        return a * b;
    }

    @Override
    public PolygonalChain getPolygonalChain() {
        return new PolygonalChain(
                point,
                new Point(point.x, point.y + a),
                new Point(point.x + b, point.y + a),
                new Point(point.x + b, point.y)
        );
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "point=" + point +
                ", a=" + a +
                ", b=" + b +
                '}';
    }
}
