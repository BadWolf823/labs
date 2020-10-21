package ru.muravyov.geometry;

public class Circle extends Figure {
    private double radius;
    public Point point;

    public Circle(Point point, double radius){
        if (radius <= 0) throw new IllegalArgumentException("unsupported radius <= 0");
        this.point = point;
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    public void setRadius(double radius) {
        if (radius > 0) this.radius = radius;
    }
}
