/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student5;

import java.util.Arrays;

/**
 *
 * @author muravyovas
 */
public class Labs {

    public static void main(String[] args) {
        Student vasia = new Student("Вася",3,4,5,4);
        Student pete = new Student("Петя",5,5,5,5);
        System.out.println(vasia.getAverage());
        System.out.println(vasia.isExcellent());
        System.out.println(pete.getAverage());
        System.out.println(pete.isExcellent());
    }

}
