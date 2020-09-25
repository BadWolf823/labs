/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fraction;

/**
 *
 * @author muravyovas
 */
public class Labs {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(1, 3);
        Fraction f2 = new Fraction(2, 3);
        int x = 0;
        System.out.println(f1 + " + " + f2 + "=" + f1.sum(f2));
        System.out.println(f1 + " - " + f2 + "=" + f1.minus(f2));
        System.out.println(f1 + " * " + f2 + "=" + f1.multiplication(f2));
        System.out.println(f1 + " / " + f2 + "=" + f1.div(f2));
        System.out.println(f1 + " / " + x + "=" + f1.div(x));
    }
}
