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
public class Learn {
    public static void main(String[] args){
        Person ivan = new Person(new Name("Иван","Чудов"),180);
        Person petr = new Person(new Name("Пётр","Чудов"), 170);
        Person boris = new Person(new Name("Борис"),175);
        petr.setFather(ivan);
        boris.setFather(petr);
        System.out.println(ivan.toString());
        System.out.println(petr.toString());
        System.out.println(boris.toString());
    }
}
