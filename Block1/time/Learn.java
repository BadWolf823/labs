/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Block1.time;

/**
 *
 * @author muravyovas
 */
public class Learn {
    public static void main(String[] args){
        Time time1 = new Time(10);
        Time time2 = new Time(10000);
        Time time3 = new Time(100000);
        System.out.println(time1.toString());
        System.out.println(time2.toString());
        System.out.println(time3.toString());
    }
}
