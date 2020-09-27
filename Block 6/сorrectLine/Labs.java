/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package сorrectLine;

/**
 *
 * @author muravyovas
 */
public class Labs {

    public static void main(String[] args) {
        Point p1 = new Point(1, 1);
        Point p2 = new Point(2,5);
        Line line1 = new Line(p1,p2);
        System.out.println(line1);
        p1.x = 0;
        p1.y = 0;
        System.out.println(line1);
        line1.setPointStart(p2);
        System.out.println(line1);
        p2.x = 0;
        System.out.println(line1);
    }
}
