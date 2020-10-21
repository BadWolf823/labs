/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.muravyov.cities.block9;

/**
 *
 * @author muravyovas
 */
public class Road {
    private City city;
    int cost;
    public Road(City city, int cost){
        this.city = city;
        this.cost = cost;
    }

    public City getCity(){return city;}

    @Override
    public String toString() {
        return city.name + ": " + this.cost;
    }
    
}
