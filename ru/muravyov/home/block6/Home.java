/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.muravyov.home.block6;

/**
 *
 * @author muravyovas
 */
public class Home {
    private final int floor;
    public Home(int floor) throws Exception{
        if (floor < 0) throw new Exception("Negative number of floor");
        this.floor = floor;
    }
    
    public String toString(){
        if (this.floor % 10 == 1){return "дом с " + this.floor + " этажом";}
        return "дом с "+this.floor + " этажами";
    }
}
