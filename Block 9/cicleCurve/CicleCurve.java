/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cicleCurve;

/**
 *
 * @author badwolf
 */
public class CicleCurve extends Curve{
    public CicleCurve(Point ... points) {
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
