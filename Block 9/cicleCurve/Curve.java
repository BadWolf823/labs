/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cicleCurve;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author muravyovas
 */
public class Curve {
    List<Point> points = new ArrayList<>();
    
    public Curve(){}
    public Curve(Point ... points){
        Collections.addAll(this.points, points);
    }

    @Override
    public String toString() {
        return "Линия " + points.toString();
    }
    
    public double getLength(){
        double res = 0;
        for (int i = 0; i < this.points.size() - 1; i++){
            res += new Line(this.points.get(i), this.points.get(i + 1)).getLength();
        }
        return res;
    }
}
