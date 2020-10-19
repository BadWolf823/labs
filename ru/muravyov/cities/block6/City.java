/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.muravyov.cities.block6;

import java.util.ArrayList;
import java.util.List;

/**
 * @author muravyovas
 */
public class City {
    String name;
    private final List<Road> roads = new ArrayList<>();

    public City(String name) {
        this.name = name;
    }

    public City(String name, Road... roads) {
        this(name);
        for (Road road : roads) {
            this.addRoad(road);
        }
    }

    /* Добавление дороги в список дорог из города */
    public void addRoad(Road road) {
        if (road.getCity() == this) throw new IllegalArgumentException("Road City to City can't add in list of roads");
        for (Road roadOutThisCity : this.roads) {
            if (roadOutThisCity.getCity() == road.getCity())
                throw new IllegalArgumentException("List of roads has road in this city");
        }
        this.roads.add(road);
    }

    /* Удаление дороги из списка дорог из города */
    public void eraseRoad(Road road) {
        roads.remove(road);
    }

    @Override
    public String toString() {
        String res = this.name + ":\n";
        for (Road road : this.roads) {
            res += "\t" + road.toString() + "\n";
        }
        return res;
    }

}
