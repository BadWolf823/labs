/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.muravyov.geometry.block11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import ru.muravyov.geometry.block1.Point;
import ru.muravyov.geometry.block6.Line;

/**
 *
 * @author muravyovas
 */

public class PolygonalChain implements Chainable{
    List<Point> points = new ArrayList<>();
    
    PolygonalChain(){}
    PolygonalChain(Point ...points){
        Collections.addAll(this.points, points);
    }

    @Override
    public String toString() {
        return "Линия " + points.toString();
    }
    
    public double getLength(){
        double res = 0;
        for (int i = 0; i < points.size() - 1; i++){
            res += new Line(points.get(i), points.get(i + 1)).getLength();
        }
        return res;
    }

    @Override
    public PolygonalChain getPolygonalChain() {
        return this;
    }
}
