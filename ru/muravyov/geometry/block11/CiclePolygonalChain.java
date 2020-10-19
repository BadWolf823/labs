/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.muravyov.geometry.block11;

import ru.muravyov.geometry.block1.Point;
import ru.muravyov.geometry.block6.Line;

public class CiclePolygonalChain extends PolygonalChain{
    public CiclePolygonalChain(Point ...points) {
        super(points);
    }
    
    @Override
    public double getLength() {
        return  super.getLength() +
                (new Line(
                        this.points.get(0), 
                        this.points.get(this.points.size()-1)
                )).getLength();
    }
    
}
