/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Block1.people;

/**
 *
 * @author muravyovas
 */
public class Person {
    String name;
    int height;
    Person(String name, int height){
        this.name = name;
        this.height = height;
    }
    public String toString(){
        if (this.height < 160) return this.name + " маленький человек";
        if (this.height > 185) return this.name + " высокий человек";
        return this.name + " средний человек";
    }
}
