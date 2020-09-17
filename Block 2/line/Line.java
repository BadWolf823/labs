/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Block2.line;

/**
 *
 * @author muravyovas
 */
public class Line {
    Point pointStart;
    Point pointEnd;
    Line(Point pointStart, Point pointEnd){
        this.pointStart = pointStart;
        this.pointEnd = pointEnd;
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
}
