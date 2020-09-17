/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recordBook;

import java.util.Arrays;

/**
 *
 * @author muravyovas
 */
public class Labs {
    public static void main(String[] args) {
        RecordBook vasia = new RecordBook(
                "Вася",
                171896,
                new Exam[]{
                    new Exam("информатика","Ермаков",5),
                    new Exam("математика","Петрова",4),
                    new Exam("физика","Сидоров",5)
                }
        );
        vasia.exams[2] = new Exam("английский язык","Буров",4);
        RecordBook pete = new RecordBook(
                "Петя",
                173654,
                Arrays.copyOf(vasia.exams, vasia.exams.length)
        );
        pete.exams[1] = new Exam(pete.exams[1].name, pete.exams[1].prepod,5);
        System.out.println(pete);
        System.out.println(vasia);
    }
}
