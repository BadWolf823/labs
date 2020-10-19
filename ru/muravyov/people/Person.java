/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.muravyov.people;


/**
 *
 * @author muravyovas
 */
public class Person {
    private final Name name;
    private int height;
    private final Person father;
    Person(Name name, int height) throws Exception{
        this(name, height, null);
    }
    Person(String name, int height) throws Exception{
        this(new Name(name), height);
    }
    Person(String name, int height, Person father) throws Exception{
        this(new Name(name),height,father);
    }
    Person(Name name, int height, Person father) throws Exception{
        this.name = name;
        if ((height > 0)&&(height <= 500)) this.height = height;
        else throw new Exception("Negative heigth");
        if (father != null){
            this.father = father;
            if (this.name.getPatronymic() == null) this.name.setPatronymic(father.name.getName() + "ович");
            if (this.name.getSurname() == null) this.name.setSurname(father.name.getSurname());
        } else {
            this.father = null;
        }
    }   
    
    public Name getName() {
        return this.name;
    }
    
    public Person getFather() throws Exception {
        return father;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    
    public String toString(){
        return this.name + ": " + this.height;
    }
}
