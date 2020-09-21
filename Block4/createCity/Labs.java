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
public class Labs {
    public static void main(String[] args) throws Exception {
        City city1 = new City("city1");
        City city2 = new City("city2");
        City city3 = new City("city3");
        City city4 = new City("city4");
        City testCity = new City("testCity",new City[]{city1,city2,city3,city4},new int[]{1,2,3,4});
        System.out.println(testCity);
    }
}
