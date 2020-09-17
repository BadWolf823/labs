/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peopleWithParent;


/**
 *
 * @author muravyovas
 */
public class Person {
    Name name;
    int height;
    Person father;
    Person(Name name, int height){
        this.name = name;
        this.height = height;
    }
    public void setFather(Person father){
        this.father = father;
        if (this.name.surname == null) 
                this.name.surname = father.name.surname;
        if (this.name.patronymic == null) 
                this.name.patronymic = father.name.name + "ович";
    }
    public String toString(){
        if (this.height < 160) return this.name.toString() + " маленький человек";
        if (this.height > 185) return this.name.toString() + " высокий человек";
        return this.name.toString() + " средний человек";
    }
}
