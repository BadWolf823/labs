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
public class Learn {
    public static void main(String[] args){
        Person pushkin = new Person(new Name("Александр","Сергеевич","Пушкин"),167);
        Person kleopatra = new Person(new Name("Клеопатра"),152);
        Person vladimir = new Person(new Name("Владимир","Маяковский"),189);
        System.out.println(pushkin.toString());
        System.out.println(kleopatra.toString());
        System.out.println(vladimir.toString());
    }
}
