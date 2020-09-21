/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package createPerson;


/**
 *
 * @author muravyovas
 */
public class Person {
    Name name;
    int height;
    Person father;
    Person(Name name, int height){
        this(name, height, null);
    }
    Person(String name, int height){
        this(new Name(name), height);
    }
    Person(String name, int height, Person father){
        this(new Name(name),height,father);
    }
    Person(Name name, int height, Person father){
        this.name = name;
        this.height = height;
        if (father != null){
            this.father = father;
            if (this.name.patronymic == null) this.name.patronymic = father.name.name + "ович";
            if (this.name.surname == null) this.name.surname = father.name.surname;
        }
    }
    public void setFather(Person father){
        this.father = father;
        if (this.name.surname == null) 
                this.name.surname = father.name.surname;
        if (this.name.patronymic == null) 
                this.name.patronymic = father.name.name + "ович";
    }
    public String toString(){
        return this.name + ": " + this.height;
    }
}
