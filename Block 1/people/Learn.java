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
public class Learn {
    public static void main(String[] args){
        Person pushkin = new Person("Пушкин",167);
        Person kleopatra = new Person("Клеопатра",152);
        Person vladimir = new Person("Владимир",189);
        System.out.println(pushkin.toString());
        System.out.println(kleopatra.toString());
        System.out.println(vladimir.toString());
    }
}
