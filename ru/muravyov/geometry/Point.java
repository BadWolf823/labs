package ru.muravyov.geometry;


public class Point implements Comparable<Point>, Cloneable{

    public int x, y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public String toString(){
        return "{"+this.x+";"+this.y+"}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (Point.class!= o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x &&
                y == point.y;
    }

    @Override
    public int hashCode() {
        return x + y;
    }

    @Override
    public int compareTo(Point o) {
        if (o.x > this.x && o.y > this.y) return -1;
        if (o.x < this.x && o.y < this.y) return 1;
        return 0;
    }

    @Override
    protected Point clone() throws CloneNotSupportedException {
        return (Point) super.clone();
    }
}
