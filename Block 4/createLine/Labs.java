/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package createLine;

/**
 *
 * @author muravyovas
 */
public class Labs {

    public static void main(String[] args) {
        Line line1 = new Line(1, 3, 23, 8);
        Line line2 = new Line(5, 10, 25, 10);
        Line line3 = new Line(line1.pointStart, line2.pointEnd);
        System.out.println(line1.toString());
        System.out.println(line2.toString());
        System.out.println(line3.toString());
        System.out.println();
        line1.pointStart.x = 4;
        line2.pointEnd.x = 10;
        System.out.println(line1.toString());
        System.out.println(line2.toString());
        System.out.println(line3.toString());
        System.out.println();
    }
}
