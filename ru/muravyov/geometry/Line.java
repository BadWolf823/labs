/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.muravyov.geometry;


/**
 *
 * @author muravyovas
 */
public class Line implements Cloneable{
    private Point pointStart;
    private Point pointEnd;
    public Line(Point pointStart, Point pointEnd){
        this(pointStart.x, pointStart.y, pointEnd.x, pointEnd.y);
    }
    public Line(int x1, int y1, int x2, int y2){
        this.pointStart = new Point(x1, y1);
        this.pointEnd = new Point(x2, y2);
    }
    private Line(Line line) throws CloneNotSupportedException{
        this.pointStart = line.pointStart.clone();
        this.pointEnd = line.pointEnd.clone();
    }

    public double getLength(){
        int res = (pointStart.x - pointEnd.x) * (pointStart.x - pointEnd.x) + 
                (pointStart.y - pointEnd.y) * (pointStart.y - pointEnd.y);
        return Math.sqrt(res);
    }
    public String toString(){
        return "Линия от {"
                + pointStart.x
                + ";"
                + pointStart.y
                + "} до {"
                + pointEnd.x
                + ";"
                + pointEnd.y
                + "}";
    }

    public Point getPointStart() {
        return pointStart;
    }

    public Point getPointEnd() {
        return pointEnd;
    }

    public void setPointStart(Point pointStart) {
        this.pointStart = new Point(pointStart.x, pointStart.y);
    }

    public void setPointEnd(Point pointEnd) {
        this.pointEnd = new Point(pointEnd.x, pointEnd.y);
    }

    /* Точки private, в них точно есть объект, если из внутри класса им не присвоили null*/
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (Line.class != o.getClass()) return false;
        Line line = (Line) o;
        return (pointStart.equals(line.pointStart) && pointEnd.equals(line.pointEnd));
    }

    @Override
    public int hashCode() {
        return pointEnd.hashCode() + pointStart.hashCode();
    }

    @Override
    protected Line clone() throws CloneNotSupportedException {
        return new Line(this);
        /*
        Line line = (Line) super.clone();
        line.pointStart = line.pointStart.clone();
        line.pointEnd = line.pointEnd.clone();
        return (Line) super.clone();
        */
    }
}
