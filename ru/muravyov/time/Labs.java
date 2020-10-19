/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.muravyov.time;

/**
 *
 * @author muravyovas
 */
public class Labs {
    public static void main(String[] args){
        ExtraTime et = new ExtraTime(172799, new TimeZone(13,30));
        System.out.println(et);
        System.out.println(new Time(172799));
    }
}
