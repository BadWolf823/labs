/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recordBook;

/**
 *
 * @author muravyovas
 */
public class Exam {
    String name;
    String prepod;
    int appraisal;

    public Exam(String name, String prepod, int appraisal) {
        this.name = name;
        this.prepod = prepod;
        this.appraisal = appraisal;
    }

    @Override
    public String toString() {
        return this.name +
                ", " +
                this.prepod +
                ", " +
                this.appraisal;
    }
    
}
