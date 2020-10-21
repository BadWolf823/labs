/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.muravyov.animals;

/**
 *
 * @author muravyovas
 */
public class Cat implements Meowable{
    String name;
    Cat(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "кот: " + this.name;
    }
    
    
    public void meow(int n){
        String resStr = this.name + ": ";
        for (int i = 0; i < n-1; i++){
            resStr += "мяу-";
        }
        if (n > 0) System.out.println(resStr + "мяу!");
    }

    @Override
    public void meow(){
        System.out.println(this.name + ": мяу!");
    }
}
