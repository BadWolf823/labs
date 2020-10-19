/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.muravyov.cities.block11;

import java.util.ArrayList;
import java.util.List;
import ru.muravyov.cities.block9.*;

/**
 *
 * @author muravyovas
 */
public class Labs {
    public static void main(String[] args) {
        List<City> cities = new ArrayList<>();
        cities.add(new City("A"));
        cities.add(new City("B"));
        cities.add(new City("C"));
        cities.get(0).addRoad(new Road(cities.get(1),12));
        cities.get(0).addRoad(new Road(cities.get(2), 14));
        cities.add( new SuperCity("D",
                new Road(cities.get(0),123),
                new Road(cities.get(1),234),
                new Road(cities.get(2),0)
        ));
        for (City city : cities){
            System.out.println(city);
        }
        
    }
}
