/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peopleWithName;

/**
 *
 * @author muravyovas
 */
public class Person {
    Name name;
    int height;
    Person(Name name, int height){
        this.name = name;
        this.height = height;
    }
    public String toString(){
        if (this.height < 160) return this.name.toString() + " маленький человек";
        if (this.height > 185) return this.name.toString() + " высокий человек";
        return this.name.toString() + " средний человек";
    }
}
