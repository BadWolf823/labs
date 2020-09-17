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
public class Labs {
    public static void main(String[] args) {
        City a = new City("A");
        City b = new City("B");
        City c = new City("C");
        City d = new City("D");
        City e = new City("E");
        City f = new City("F");
        a.roads = new Road[]{
            new Road(b,5),
            new Road(f,1),
            new Road(d,6)
        };
        b.roads = new Road[]{
            new Road(a,5),
            new Road(c,3)
        };
        c.roads = new Road[]{
            new Road(d,4),
            new Road(b,3)
        };
        d.roads = new Road[]{
            new Road(e,2),
            new Road(a,6),
            new Road(c,4)
        };
        e.roads = new Road[]{
            new Road(f,2)
        };
        f.roads = new Road[]{
            new Road(b,1),
            new Road(e,2)
        };
        City[] cities = {a,b,c,d,e,f};
        for (City city : cities){
            System.out.println(city);
        }
        
    }
}
