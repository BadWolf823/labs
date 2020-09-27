/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correctSquare;

/**
 *
 * @author muravyovas
 */
public class Square {
    Point startPoint;
    private int length;

    public Square(Point startPoint, int length) throws Exception {
        this.startPoint = startPoint;
        if (length < 0) throw new Exception("Negative length");
        this.length = length;
    }
    
    public Square(int x,int y,int length) throws Exception{
        this(new Point(x,y),length);
    }

    public void setLength(int length) throws Exception{
        if (length < 0) throw new Exception("Negative length");
        this.length = length;
    }
    
    public int getLength(){
        return this.length;
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
