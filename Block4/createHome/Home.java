/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package createHome;

/**
 *
 * @author muravyovas
 */
public class Home {
    final int floor;
    Home(int floor){
        this.floor = floor;
    }
    public String toString(){
        if (this.floor % 10 == 1){return "дом с " + this.floor + " этажом";}
        return "дом с "+this.floor + " этажами";
    }
}
