/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correctStudent;

import java.util.Arrays;

/**
 *
 * @author muravyovas
 */
public class Labs {

    public static void main(String[] args) throws Exception {
        Student vasia = new Student("Вася",1,2);
        Student pete = new Student("Петя",5,5,5,5);
        System.out.println(vasia.getAverage());
        System.out.println(vasia.isExcellent());
        System.out.println(pete.getAverage());
        System.out.println(pete.isExcellent());
    }

}
