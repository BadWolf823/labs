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
public class RecordBook {
    long number;
    String nameStudent;
    Exam[] exams;

    public RecordBook(String nameStudent, long number, Exam[] exams) {
        this.number = number;
        this.nameStudent = nameStudent;
        this.exams = exams;
    }
    
    @Override
    public String toString() {
        String res = this.nameStudent + ", " + this.number + ":\n";
        for (Exam exam : this.exams) {
            res += "\t" + exam.toString() + "\n";
        }
        return res;
    }
    
}
