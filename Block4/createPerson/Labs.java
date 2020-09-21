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
public class Labs {
    public static void main(String[] args) {
        Person lev = new Person("Лев",170);
        Person sp = new Person(new Name("Сергей","Пушкин"),168,lev);
        Person alex = new Person("Александр",167,sp);
        System.out.println(lev);
        System.out.println(sp);
        System.out.println(alex);
    }
}
