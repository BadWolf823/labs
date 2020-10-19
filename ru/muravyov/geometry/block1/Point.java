package ru.muravyov.geometry.block1;

public class Point {
    public int x, y;
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public String toString(){
        return "{"+this.x+";"+this.y+"}";
    }
}
