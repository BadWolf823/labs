/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curve;

/**
 *
 * @author muravyovas
 */
public class Labs {

    public static void main(String[] args) {
        Curve curve = new Curve(new Point(1,2), new Point(3,4));
        System.out.println(curve);
        System.out.println(curve.getLength());
    }
}
