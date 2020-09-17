/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

import java.util.Arrays;

/**
 *
 * @author muravyovas
 */
public class Labs {

    public static void main(String[] args) {
        Student vasia = new Student("Вася", new int[]{3, 4, 5});
        Student pete = new Student("Петя");
        pete.appraisals = vasia.appraisals; // ссылке на оценки пети присвооили ссылку на оценки васи 
        pete.appraisals[0] = 5;
        System.out.println(pete); //оценки пети ссылаются на оценки васи
        System.out.println(vasia);
        Student andrey = new Student("Андрей");
        /*создан новый массив,элементы которого равны оценкам васи, но оценки андрея не ссылаются на оценки васи*/
        andrey.appraisals = Arrays.copyOf(vasia.appraisals, vasia.appraisals.length);
        vasia.appraisals[0] = 2;
        System.out.println(vasia);
        System.out.println(andrey);
    }

}
