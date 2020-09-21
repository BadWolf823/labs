/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package createStudent;

import java.util.Arrays;

/**
 *
 * @author muravyovas
 */
public class Student {

    String name;
    int[] appraisals;

    Student(String name) {
        this(name,null);
    }

    Student(String name, int ... appraisals) {
        this.name = name;
        this.appraisals = appraisals;
    }

    @Override
    public String toString() {
        return this.name + ":" + Arrays.toString(this.appraisals);
    }

}
