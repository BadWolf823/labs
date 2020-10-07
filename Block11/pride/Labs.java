/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pride;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author muravyovas
 */
public class Labs {
    public static void main(String[] args) {
        List<Meowablem> catList = new ArrayList<>();
        catList.add(new Cat("Барсик"));
        catList.add(new Cat("Вася"));
        catList.add(new Cat("Мурзик"));
        catList.add(new randomCat());
        meow(catList);
    }
    public static void meow(List<Meowable> meowables){
        for (Meowable animal : meowables){
            animal.meow();
        }
    }
    
}
