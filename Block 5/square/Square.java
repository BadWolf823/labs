/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package square;

/**
 *
 * @author muravyovas
 */
public class Square {
    Point startPoint;
    int length;

    public Square(Point startPoint, int length) {
        this.startPoint = startPoint;
        this.length = length;
    }
    
    public Square(int x,int y,int length){
        this(new Point(x,y),length);
    }

    @Override
    public String toString() {
        return "Квадрат в точке " + startPoint + " со стороной " + length;
    }
    
    public Curve toCurve(){
        return new Curve(
                startPoint,
                new Point(startPoint.x, startPoint.y + length),
                new Point(startPoint.x + length, startPoint.y + length),
                new Point(startPoint.x + length, startPoint.y)
        );
    }
    
}
