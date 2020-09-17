/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package city;

/**
 *
 * @author muravyovas
 */
public class City {
    String name;
    Road[] roads;

    public City(String name){
        this.name = name;
    }

    public void setRoads(Road[] roads){
        this.roads = roads;
    }

    @Override
    public String toString() {
        String res = this.name + ":\n";
        for (Road road : this.roads){
            res += "\t" + road.toString() + "\n";
        }
        return res;
    }
    
}
