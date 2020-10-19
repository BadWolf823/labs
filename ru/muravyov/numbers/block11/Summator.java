/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.muravyov.numbers.block11;
import java.math.BigInteger;
import ru.muravyov.numbers.block10.Fraction;

/**
 *
 * @author muravyovas
 */
public class Summator {
    public static void main(String[] args) {
        System.out.println(sumator(1.2,new Fraction(1, 2), 3, new BigInteger("123123123123123123")));
    }
    public static double sumator(Number ...numbers){
        double sum = 0.;
        for (Number number : numbers) sum+=number.doubleValue();
        return sum;
    }
}
