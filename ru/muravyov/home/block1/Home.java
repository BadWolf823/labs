package ru.muravyov.home.block1;

public class Home {
    public int floor;
    public Home(int floor){
        this.floor = floor;
    }
    public String toString(){
        if (this.floor % 10 == 1){return "дом с " + this.floor + " этажом";}
        return "дом с "+this.floor + " этажами";
    }
}
