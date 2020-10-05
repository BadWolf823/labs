/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cicleCurve;

/**
 *
 * @author muravyovas
 */
public class Labs {

    public static void main(String[] args) {
        CicleCurve cicleCurve = new CicleCurve(new Point(1, 1), new Point(1, 2));
        Curve curve = new Curve(new Point(1, 1), new Point(1, 2));
        System.out.println(cicleCurve.getLength());
        System.out.println(cicleCurve.getLength());
        
    }
}
