/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correctPerson;

/**
 *
 * @author muravyovas
 */
public class Labs {
    public static void main(String[] args) throws Exception {
        Person p1 = new Person("Максим", 1);
        Name name = new Name("Вася","Васильев");
        Person p2 = new Person(name, 12,p1);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p2.getFather());
        System.out.println(p2);
    }
}
