/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.muravyov.numbers;
import static java.lang.Math.pow;
import static java.lang.Double.parseDouble;
/**
 *
 * @author muravyovas
 */
public class Mathematic {
    public static double sumator(Number ...numbers){
        double sum = 0.;
        for (Number number : numbers) sum+=number.doubleValue();
        return sum;
    }
    public static double power(String[] str){
        if (str.length != 2) throw new IllegalArgumentException("Length of input array != 2");
        return pow(parseDouble(str[0]), parseDouble(str[1]));
    }
}
