/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.muravyov.animals.block11;

import ru.muravyov.animals.block10.Bird;
import ru.muravyov.animals.block10.Parrot;
import ru.muravyov.animals.block10.Сuckoo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author muravyovas
 */
public class Labs {
    public static void main(String[] args) {
        List<Meowable> catList = new ArrayList<>();
        catList.add(new Cat("Барсик"));
        catList.add(new Cat("Вася"));
        catList.add(new Cat("Мурзик"));
        catList.add(new randomCat());
        meow(catList);

        songs(new Bird[]{new Parrot("KSKDKKDS"), new Сuckoo()});
    }
    public static void meow(List<Meowable> meowables){
        for (Meowable animal : meowables){
            animal.meow();
        }
    }
    static public void songs(Bird[] birds){
        for (Bird bird : birds) bird.song();
    }
    
}
