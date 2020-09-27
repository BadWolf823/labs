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
public class Labs {

    public static void main(String[] args) throws Exception {
        Square square = new Square(1, 2, 10);
        System.out.println(square);
        square.setLength(-12);
        System.out.println(square.getLength());
    }
}
