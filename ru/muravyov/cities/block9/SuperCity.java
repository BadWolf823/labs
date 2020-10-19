package ru.muravyov.cities.block9;


public class SuperCity extends City {
    public SuperCity(String name) {
        super(name);
    }

    public SuperCity(String name, Road... roads){
        this(name);
        for (Road road : roads){
            this.addRoad(road);
        }
    }
    /* Добавление дороги в список дорог из города */
    public void addRoad(Road road) {
        super.addRoad(road);
        road.getCity().addRoad(new Road(this,road.cost));
    }
}
