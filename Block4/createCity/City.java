/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package createCity;

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
    public City(String name, City[] cities, int[] prices) throws Exception{
        this(name);
        if (cities.length != prices.length) throw new Exception("Count of cities != count of prices");
        roads = new Road[cities.length];
        for (int i = 0; i < cities.length; i++){
            roads[i] = new Road(cities[i],prices[i]);
        }
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
